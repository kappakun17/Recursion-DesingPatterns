package toykitshop.toykit.humanoid;

import java.util.ArrayList;

public class HumanoidToyKit implements ToyKit{

    protected ToyHead toyHead ;
    protected ToyBody toyBody ;
    protected ToyLeftArm toyLeftArm ;
    protected ToyRightArm toyRightArm ;
    protected ToyLeftFoot toyLeftFoot ;
    protected ToyRightFoot toyRightFoot ;

    public HumanoidToyKit(){
        this.toyHead = new HumanoidToyHead();
        this.toyBody = new HumanoidToyBody();
        this.toyLeftArm = new HumanoidToyLeftArm();
        this.toyRightArm = new HumanoidToyRightArm();
        this.toyLeftFoot = new HumanoidToyRightFoot();
        this.toyRightFoot = new HumanoidToyRightFoot();
    }

   
    public String getName(){
        return "Humanoid Toy Kit";
    }
    public String getDescription(){
        String result = "The Robot Toy have a kind mind for the people.";
        result += "His head can recognize emotion of person and put to tell kind word that match the situation.";
        return result;
    }
    public int getTotalCost(){
        int total = 0;

        total += this.getToyHead().getCost();
        total += this.getToyBody().getCost();
        total += this.getToyLeftArm().getCost();
        total += this.getToyRightArm().getCost();
        total += this.getToyLeftFoot().getCost();
        total += this.getToyRightFoot().getCost();

        return total;
    }

    public ToyHead getToyHead(){
        return this.toyHead;
    }

    public ToyBody getToyBody(){
        return this.toyBody;
    }

    public ToyLeftArm getToyLeftArm(){
        return this.toyLeftArm;
    }

    public ToyRightArm getToyRightArm(){
        return this.toyRightArm;
    }

    public ToyLeftFoot getLeftFoot(){
        return this.toyLeftFoot;
    }

    public ToyRightFoot getRightFoot(){
        return this.toyRightFoot;
    }
    public ArrayList<String> checkRecommendedAge(Person person){
        ArrayList<String> recommendedAgeList = new ArrayList<>();
        int age = person.getAge();

        // Toy head
        if(!this.getToyHead().checkRecommendedAge(age)){
            recommendedAgeList.add(this.getToyHead().getPartsName());
        }

        // Toy body
        if(!this.getToyBody().checkRecommendedAge(age)){
            recommendedAgeList.add(this.getToyBody().getPartsName());
        }

        // Toy left arm
        if(!this.getToyLeftArm().checkRecommendedAge(age)){
            recommendedAgeList.add(this.getToyLeftArm().getPartsName());
        }

        // Toy right arm
        if(!this.getToyRightArm().checkRecommendedAge(age)){
            recommendedAgeList.add(this.getToyRightArm().getPartsName());
        }

        // Toy left foot
        if(!this.getToyLeftFoot().checkRecommendedAge(age)){
            recommendedAgeList.add(this.getToyLeftFoot().getPartsName());
        }

        // Toy right foot
        if(!this.getToyRightFoot().checkRecommendedAge(age)){
            recommendedAgeList.add(this.getToyRightFoot().getPartsName());
        }

        return recommendedAgeList;
        
    }
    public void getRecommendedAge(Person person){
        
        ArrayList<String> recommendedAgeList = this.checkRecommendedAge(person);

        // the case that there is no the toy parts of recommended age 
        if(recommendedAgeList.length() < 1){
            System.out.println("You are over the recommended age!");
        }

        // else
        String result = "Some parts do not exceed the recommended age.\n";
        result = "The parts: "
        for(String s : recommendedAgeList){
            result += s;
        }
        result += "\n";
        result += "The toy parts which does not meet the recommended age is encourage that make with the parents.";
    }
}