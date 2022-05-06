package lasertaggame.factory;

import lasertaggame.factory.LaserTagMonsterFactory;

import lasertaggame.monster.*;
import lasertaggame.monster.generic.*;

import tool.RandomWrapper;

public class GenericLaserTagMonsterFactory implements LaserTagMonsterFactory{
    public LowTierMonster createLowTierMonster(){
        return new LaserLowTierMonster(RandomWrapper.getRanInt(1,20));
    }
    
    public MidTierMonster createMidTierMonster(){
        return new LaserMidTierMonster(RandomWrapper.getRanInt(5,30));
    }

    public HighTierMonster createHighTierMonster(){
        return new LaserHighTierMonster(RandomWrapper.getRanInt(15,50));
    }

    public FlyingMonster createFlyingMonster(){
        return new LaserFlyingMonster(RandomWrapper.getRanInt(15,50));
    }

    public HybridMonster createHybridMonster(){
        return new LaserHybridMonster(RandomWrapper.getRanInt(15,50));
    }

    public FinalBossMonster createFinalBossMonster(){
        return new LaserFinalBossMonster(RandomWrapper.getRanInt(40,100));
    }
}