package lasertaggame.monster.antarctica;

import lasertaggame.monster.generic.LaserMidTierMonster;

public class AntarcticaMidTierMonster extends LaserMidTierMonster{

    public AntarcticaMidTierMonster(int hp, int attack, int defense, int level, int points, int movementSpeed){
        super(hp, attack, defense, level, points, movementSpeed);
    }

    public AntarcticaMidTierMonster(int level){
        super(level);
    }

    public String getMonsterName(){
        return "Antarctica Ice Mid Tier Monster";
    }
};