package lasertaggame.factory;

import lasertaggame.factory.LaserTagMonsterFactory;

import lasertaggame.monster.*;
import lasertaggame.monster.antarctica.*;

import tool.RandomWrapper;

public class AntarcticaLaserTagMonsterFactory implements LaserTagMonsterFactory {
    public LowTierMonster createLowTierMonster(){
        return new AntarcticaLowTierMonster(RandomWrapper.getRanInt(1,20));
    };

    public MidTierMonster createMidTierMonster(){
        return new AntarcticaMidTierMonster(RandomWrapper.getRanInt(5,30));
    };

    public HighTierMonster createHighTierMonster(){
        return new AntarcticaHighTierMonster(RandomWrapper.getRanInt(15,50));
    };

    public FlyingMonster createFlyingMonster(){
        return new AntarcticaFlyingMonster(RandomWrapper.getRanInt(15,50));
    };

    public HybridMonster createHybridMonster(){
        return new AntarcticaHybridMonster(RandomWrapper.getRanInt(15,50));
    };

    public FinalBossMonster createFinalBossMonster(){
        return new AntarcticaFinalBossMonster(RandomWrapper.getRanInt(40,100));
    };
}