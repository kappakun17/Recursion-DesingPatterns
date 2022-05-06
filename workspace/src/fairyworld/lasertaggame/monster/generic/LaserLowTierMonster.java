package lasertaggame.monster.generic;

import lasertaggame.monster.LowTierMonster;
import lasertaggame.monster.generic.LaserMonster;
import lasertaggame.monster.skill.Skill;

public class LaserLowTierMonster extends LaserMonster implements LowTierMonster{
    public LaserLowTierMonster(int hp, int attack, int defense, int level, int points, int movementSpeed){
        super(hp, attack, defense, level, points, movementSpeed);
    }

    public LaserLowTierMonster(int level){
        super(level);
    }

    public Skill mainSkill(){
        return this.specialSkills[0];
    }

    protected void setInitialSkills(){
        Skill[] s = {new Skill(this.attack, "Generic attack"), new Skill(this.attack*2, "Generic side attack")};
        this.setSpecialSkills(s);
    }

    public String getMonsterName(){
        return "Generic Low Tier Monster";
    }
}