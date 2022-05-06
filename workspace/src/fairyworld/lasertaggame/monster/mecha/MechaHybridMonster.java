package lasertaggame.monster.mecha;

import lasertaggame.monster.generic.LaserHybridMonster;


public class MechaHybridMonster extends LaserHybridMonster{
    public MechaHybridMonster(int hp, int attack, int defense, int level, int points, int movementSpeed, int flyingSpeed, int ascendSpeed, int descendSpeed){
        super(hp, attack, defense, level, points, movementSpeed, flyingSpeed, ascendSpeed, descendSpeed);
    }

    public MechaHybridMonster(int level){
        super(level);
    }

    public String getMonsterName(){
        return "Mecha Laser Hybrid Monster";
    }
}