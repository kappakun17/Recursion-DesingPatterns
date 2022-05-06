package toykitshop.toykit.robot;

import java.util.ArrayList;

public class RobotToyKit extends HumanoidToyKit implements Robot{

    private ToyEye toyEye;
    public RobotToyKit(){
        super();
        this.toyEye = new RobotToyEye();
    }

    public String getName(){
        return "Robot Toy Kit";
    }
    
    public String getDescription(){
        String result = "The Robot Toy have a kind mind for the people.";
        result += "His head can recognize emotion of person and put to tell kind word that match the situation.";
        return result;
    }
    public int getTotalCost(){
        int total = super();
        total += this.getToyEye().getCost();

        return total;
    }

    public ToyRightFoot getToyEye(){
        return this.toyEye;
    }
    public ArrayList<String> checkRecommendedAge(Person person){
        ArrayList<String> recommendedAgeList = super();

        if(this.getToyEye().checkRecommendedAge(person)){
            recommendedAgeList.add(this.getToyEye.getPartsName());
        }

        return recommendedAgeList;
        
    }
}