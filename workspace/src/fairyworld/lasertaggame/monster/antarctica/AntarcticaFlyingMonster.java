package lasertaggame.monster.antarctica;

import lasertaggame.monster.generic.LaserFlyingMonster;

public class AntarcticaFlyingMonster extends LaserFlyingMonster{
    public AntarcticaFlyingMonster(int hp, int attack, int defense, int level, int points, int movementSpeed, int flyingSpeed){
        super(hp, attack, defense, level, points, movementSpeed, flyingSpeed);
    }

    public AntarcticaFlyingMonster(int level){
        super(level);
    }

    public String getMonsterName(){
        return "Antarctica Ice Flying Monster";
    }
};