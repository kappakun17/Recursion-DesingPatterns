package lasertaggame.factory;

import lasertaggame.factory.LaserTagMonsterFactory;

import lasertaggame.monster.*;
import lasertaggame.monster.mecha.*;

import tool.RandomWrapper;

public class MechaLaserTagMonsterFactory implements LaserTagMonsterFactory {
    public LowTierMonster createLowTierMonster(){
        return new MechaLowTierMonster(RandomWrapper.getRanInt(1,20));
    };

    public MidTierMonster createMidTierMonster(){
        return new MechaMidTierMonster(RandomWrapper.getRanInt(5,30));
    };

    public HighTierMonster createHighTierMonster(){
        return new MechaHighTierMonster(RandomWrapper.getRanInt(15,50));
    };

    public FlyingMonster createFlyingMonster(){
        return new MechaFlyingMonster(RandomWrapper.getRanInt(15,50));
    };

    public HybridMonster createHybridMonster(){
        return new MechaHybridMonster(RandomWrapper.getRanInt(15,50));
    };

    public FinalBossMonster createFinalBossMonster(){
        return new MechaFinalBossMonster(RandomWrapper.getRanInt(40,100));
    };
}