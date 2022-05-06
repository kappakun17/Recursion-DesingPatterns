package lasertaggame.monster.generic;

import lasertaggame.monster.generic.LaserLowTierMonster;
import lasertaggame.monster.MidTierMonster;
import lasertaggame.monster.skill.Skill;

public class LaserMidTierMonster extends LaserLowTierMonster implements MidTierMonster{
    public LaserMidTierMonster(int hp, int attack, int defense, int level, int points, int movementSpeed){
        super(hp, attack, defense, level, points, movementSpeed);
    }

    public LaserMidTierMonster(int level){
        super(level);
    }

    public Skill sideSkill(){
        return this.specialSkills[0];
    };

    protected void setInitialSkills(){
        Skill[] s = {new Skill(this.attack,"Generic attack"), new Skill(this.attack*2,"Generic side attack")};
        this.setSpecialSkills(s);
    }

    public String getMonsterName(){
        return "Generic Mid Tier Monster";
    }
}