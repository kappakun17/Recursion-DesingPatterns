package lasertaggame.monster;

import lasertaggame.monster.Monster;
import lasertaggame.monster.skill.Skill;

public interface LowTierMonster extends Monster{
    abstract public Skill mainSkill();
}