package lasertaggame.monster.mecha;

import lasertaggame.monster.generic.LaserFlyingMonster;

public class MechaFlyingMonster extends LaserFlyingMonster{
    public MechaFlyingMonster(int hp, int attack, int defense, int level, int points, int movementSpeed, int flyingSpeed){
        super(hp, attack, defense, level, points, movementSpeed, flyingSpeed);
    }

    public MechaFlyingMonster(int level){
        super(level);
    }

    public String getMonsterName(){
        return "Mecha Laser Flying Monster";
    }
};