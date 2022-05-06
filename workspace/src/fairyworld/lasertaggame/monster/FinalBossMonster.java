package lasertaggame.monster;

import lasertaggame.monster.HighTierMonster;

public interface FinalBossMonster extends HighTierMonster{
    abstract public String stageIncrement();
    abstract public String stageDecrement();
}

