package lasertaggame;

import customer.Person;
import lasertaggame.factory.LaserTagMonsterFactory;
import lasertaggame.monster.*;


public class LaserTagGame{
    public void playLaserTag(Person person, LaserTagMonsterFactory factory){
        String endl = System.lineSeparator();
        System.out.println(person + "will now play laser tag!" + endl);

        LowTierMonster lowMon = factory.createLowTierMonster();
        System.out.println("Fighting " + lowMon + "....Defeated." + endl);
        MidTierMonster midMon  = factory.createMidTierMonster();
        System.out.println("Fighting " + midMon + "....Defeated." + endl);
        HighTierMonster highMon = factory.createHighTierMonster();
        System.out.println("Fighting " + highMon + "....Defeated." + endl);
        FlyingMonster flyMon = factory.createFlyingMonster();
        System.out.println("Fighting " + flyMon + "....Defeated." + endl);
        HybridMonster hybridMon = factory.createHybridMonster();
        System.out.println("Fighting " + hybridMon + "....Defeated." + endl);
        FinalBossMonster finalMon = factory.createFinalBossMonster();
        System.out.println("Fighting " + finalMon + "....Defeated." + endl);


        System.out.println("Congratulations! All monsters were defeated!" + endl);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxx" + endl);
    }
}