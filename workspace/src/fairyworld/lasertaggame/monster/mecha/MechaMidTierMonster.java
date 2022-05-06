package lasertaggame.monster.mecha;

import lasertaggame.monster.generic.LaserMidTierMonster;

public class MechaMidTierMonster extends LaserMidTierMonster{

    public MechaMidTierMonster(int hp, int attack, int defense, int level, int points, int movementSpeed){
        super(hp, attack, defense, level, points, movementSpeed);
    }

    public MechaMidTierMonster(int level){
        super(level);
    }

    public String getMonsterName(){
        return "Mecha Laser Mid Tier Monster";
    }
};