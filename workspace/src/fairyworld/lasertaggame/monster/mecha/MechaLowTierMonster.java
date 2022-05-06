package lasertaggame.monster.mecha;

import lasertaggame.monster.generic.LaserLowTierMonster;

public class MechaLowTierMonster extends LaserLowTierMonster{
    public MechaLowTierMonster(int hp, int attack, int defense, int level, int points, int movementSpeed){
        super(hp, attack, defense, level, points, movementSpeed);
    }
    
    public MechaLowTierMonster(int level){
        super(level);
    }

    public String getMonsterName(){
        return "Mecha Laser Low Tier Monster";
    }
}