package lasertaggame.monster;

import java.util.Arrays;
import lasertaggame.monster.skill.Skill;
import lasertaggame.monster.MidTierMonster;


public interface HighTierMonster extends MidTierMonster{
    abstract public Skill[] sideSkills();
}

