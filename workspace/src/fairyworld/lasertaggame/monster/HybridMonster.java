package lasertaggame.monster;

import lasertaggame.monster.FlyingMonster;

public interface HybridMonster extends FlyingMonster{
    abstract public int getAscendSpeed();
    abstract public int getDescendSpeed();
}

