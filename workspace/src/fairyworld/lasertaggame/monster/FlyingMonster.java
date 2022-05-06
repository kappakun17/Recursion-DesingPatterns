package lasertaggame.monster;

import lasertaggame.monster.HighTierMonster;
import lasertaggame.monster.skill.Fly;
import lasertaggame.monster.skill.Skill;

public interface FlyingMonster extends HighTierMonster{
    abstract public Skill mainFlySkill();
    abstract public Skill[] flySideSkills();
    abstract public Skill[] getFlyingSkills();
    abstract public int getFlySpeed();
    abstract public String flyAnimation();
}
