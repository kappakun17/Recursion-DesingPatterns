package toykitshop.toykit.robot;

import toykitshop.toykit.ToyHead;

public class RobotToyHead implements ToyHead{
    private final int RECOMMENDED_AGE = 4;
    private final int TOTAL_COST = 1500;
    private 
    
    public String getPatrsName(){
        return "Head";
    }

    public int getCost(){
        return this.TOTAL_COST;
    }

    public int getRECOMMENDED_AGE(){
        return this.RECOMMENDED_AGE;
    }

    public boolean checkRecommendedAge(int age){
        if(age >= getRECOMMENDED_AGE) return true;
        return false;
    }
}