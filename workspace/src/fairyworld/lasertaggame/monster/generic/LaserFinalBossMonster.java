package lasertaggame.monster.generic;

import lasertaggame.monster.FinalBossMonster;
import lasertaggame.monster.generic.LaserHighTierMonster;

public class LaserFinalBossMonster extends LaserHighTierMonster implements FinalBossMonster{
    protected static final int TOTAL_STAGES = 3;
    protected int currentStage = 0;

    public LaserFinalBossMonster(int hp, int attack, int defense, int level, int points, int movementSpeed){
        super(hp, attack, defense, level, points, movementSpeed);
    }

    public LaserFinalBossMonster(int level){
        super(level);
    }

    // ステージごとにattackが増加します。
    public String stageIncrement(){
        if(this.currentStage >= LaserFinalBossMonster.TOTAL_STAGES) return "NO MORE STAGES";
        this.currentStage++;
        this.attack*=this.currentStage;
        this.defense*=this.currentStage;
        return "BOSS MONSTER CHANGE! STAGE - " + this.currentStage;
    };

    public String stageDecrement(){
        if(this.currentStage <= 0) return "NO MORE STAGES";
        this.currentStage--;
        this.attack/=this.currentStage;
        this.defense/=this.currentStage;
        return "BOSS MONSTER REVERT! STAGE - " + this.currentStage;
    };

    public String getMonsterName(){
        return "Generic Final Boss Monster";
    }
}