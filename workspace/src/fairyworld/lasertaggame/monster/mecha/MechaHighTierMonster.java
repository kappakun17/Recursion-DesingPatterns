package lasertaggame.monster.mecha;

import lasertaggame.monster.generic.LaserHighTierMonster;

public class MechaHighTierMonster extends LaserHighTierMonster{
    public MechaHighTierMonster(int hp, int attack, int defense, int level, int points, int movementSpeed){
        super(hp, attack, defense, level, points, movementSpeed);
    }

    public MechaHighTierMonster(int level){
        super(level);
    }

    public String getMonsterName(){
        return "Mecha Laser High Tier Monster";
    }
};