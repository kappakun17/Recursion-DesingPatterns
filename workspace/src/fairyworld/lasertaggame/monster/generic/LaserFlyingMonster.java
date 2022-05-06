package lasertaggame.monster.generic;

import lasertaggame.monster.FlyingMonster;
import lasertaggame.monster.generic.LaserHighTierMonster;
import lasertaggame.monster.skill.Fly;
import lasertaggame.monster.skill.Skill;

import java.util.Arrays;

public class LaserFlyingMonster extends LaserHighTierMonster implements FlyingMonster, Fly{
    protected int flyingSpeed;
    protected Skill[] flyingSkills;

    public LaserFlyingMonster(int hp, int attack, int defense, int level, int points, int movementSpeed, int flyingSpeed){
        super(hp, attack, defense, level, points, movementSpeed);
        this.flyingSpeed = flyingSpeed;
    }

    public LaserFlyingMonster(int level){
        super(level);
        this.flyingSpeed = level * LaserFlyingMonster.MULTIPLIERS[4];
    }

    public int getFlySpeed(){
        return this.flyingSpeed;
    }

    public String flyAnimation(){
        return "The monster flaps its wings to fly";
    }

    public String fly(){
        return "This object flies. " + this.flyAnimation();
    };

    protected void setInitialSkills(){
        Skill[] s = {new Skill(this.attack,"Generic attack"), new Skill(this.attack*2,"Generic side attack"), new Skill(this.attack*3,"Generic side attack 2")};
        this.setSpecialSkills(s);

        Skill[] fs = {new Skill(this.attack,"Generic fly attack"), new Skill(this.attack*2,"Generic side fly attack"), new Skill(this.attack*3,"Generic side fly attack 2")};
        this.setFlyingSkills(fs);
    }

    protected void setFlyingSkills(Skill[] skills){
        this.flyingSkills = skills;
    }

    public Skill[] getFlyingSkills(){
        return this.flyingSkills;
    };

    public Skill mainFlySkill(){
        return this.flyingSkills[0];
    };

    public Skill[] flySideSkills(){
        return Arrays.copyOfRange(this.flyingSkills, 1, this.flyingSkills.length);
    };

    public String getMonsterName(){
        return "Generic Flying Monster";
    }
}