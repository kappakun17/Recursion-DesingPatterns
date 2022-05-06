package lasertaggame.monster.antarctica;

import lasertaggame.monster.generic.LaserLowTierMonster;

public class AntarcticaLowTierMonster extends LaserLowTierMonster{
    public AntarcticaLowTierMonster(int hp, int attack, int defense, int level, int points, int movementSpeed){
        super(hp, attack, defense, level, points, movementSpeed);
    }
    
    public AntarcticaLowTierMonster(int level){
        super(level);
    }

    public String getMonsterName(){
        return "Antarctica Ice Low Tier Monster";
    }
}