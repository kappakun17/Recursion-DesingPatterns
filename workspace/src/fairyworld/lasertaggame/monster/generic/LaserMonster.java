package lasertaggame.monster.generic;

import lasertaggame.monster.Monster;
import lasertaggame.monster.skill.Skill;
public class LaserMonster implements Monster{
    protected static int[] MULTIPLIERS = {100,20,30,5,1};

    protected String monsterName;
    protected int hp;
    protected int attack;
    protected int defense;
    protected int level;
    protected int points;
    protected int movementSpeed;
    protected Skill[] specialSkills;

    public LaserMonster(int hp, int attack, int defense, int level, int points, int movementSpeed){
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.level = level;
        this.points = points;
        this.movementSpeed = movementSpeed;
        
        this.setInitialSkills();
    }

    public LaserMonster(int level){
        this.hp = level*LaserMonster.MULTIPLIERS[0];
        this.attack = level*LaserMonster.MULTIPLIERS[1];
        this.defense = level*LaserMonster.MULTIPLIERS[2];
        this.level = level;
        this.points = level* level * LaserMonster.MULTIPLIERS[3];
        this.movementSpeed = level*LaserMonster.MULTIPLIERS[4];

        this.setInitialSkills();
    }

    protected void setInitialSkills(){
        Skill[] skills = {new Skill(this.attack, "Generic attack")};
        this.specialSkills = skills;
    }

    protected void setSpecialSkills(Skill[] skills){
        this.specialSkills = skills;
    }

    public int getHp(){
        return this.hp;
    }

    public int getAttack(){
        return this.attack;
    };

    public int getDefense(){
        return this.defense;
    };

    public int getPoints(){
        return this.points;
    };

    public int getLevel(){
        return this.level;
    }

    public int getMovementSpeed(){
        return this.movementSpeed;
    };

    public String kill(){
        this.hp = 0;
        return this.toString() + " died. The body drops and disappears from the screen in 2 seconds.";
    }

    public Skill[] getSpecialSkill(){
        return this.specialSkills;
    }

    public String getMonsterName(){
        return "Generic Monster";
    }

    public String getAppearance(){
        return "Grey block monster with a ? as its texture.";
    }

    public String toString(){
        return this.getMonsterName() 
        + " hp-" + this.hp
        + "/atk-" + this.attack
        + "/def-" + this.defense
        + "/lvl-" + this.level;
    }
}