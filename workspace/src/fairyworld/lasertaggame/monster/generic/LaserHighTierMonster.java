package lasertaggame.monster.generic;

import lasertaggame.monster.generic.LaserMidTierMonster;
import lasertaggame.monster.HighTierMonster;
import lasertaggame.monster.skill.Skill;

import java.util.Arrays;

public class LaserHighTierMonster extends LaserMidTierMonster implements HighTierMonster{
    public LaserHighTierMonster(int hp, int attack, int defense, int level, int points, int movementSpeed){
        super(hp, attack, defense, level, points, movementSpeed);
    }

    public LaserHighTierMonster(int level){
        super(level);
    }

    public Skill[] sideSkills(){
        return Arrays.copyOfRange(this.specialSkills, 1, this.specialSkills.length);
    }
    
    protected void setInitialSkills(){
        Skill[] s = {new Skill(this.attack, "Generic attack"), new Skill(this.attack*2,"Generic side attack"), new Skill(this.attack*3, "Generic side attack 2")};
        this.setSpecialSkills(s);
    }

    public String getMonsterName(){
        return "Generic High Tier Monster";
    }
}