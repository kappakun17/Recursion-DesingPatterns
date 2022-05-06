package lasertaggame.monster.mecha;

import lasertaggame.monster.generic.LaserFinalBossMonster;

public class MechaFinalBossMonster extends LaserFinalBossMonster{
    public MechaFinalBossMonster(int hp, int attack, int defense, int level, int points, int movementSpeed){
        super(hp, attack, defense, level, points, movementSpeed);
    }

    public MechaFinalBossMonster(int level){
        super(level);
    }

    public String getMonsterName(){
       return "Mecha Laser Final Boss Monster";
    }
}