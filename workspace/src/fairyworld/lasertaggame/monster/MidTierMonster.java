package lasertaggame.monster;

import lasertaggame.monster.LowTierMonster;
import lasertaggame.monster.skill.Skill;

public interface MidTierMonster extends LowTierMonster{
    abstract public Skill sideSkill();
}