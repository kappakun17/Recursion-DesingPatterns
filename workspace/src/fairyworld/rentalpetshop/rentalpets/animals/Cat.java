package rentalpetshop.rentalpets.animals;

import rentalpetshop.rentalpets.animals.Mammal;
import rentalpetshop.rentalpets.PlayfulPet;

import customer.Person;

import java.util.Arrays;

public class Cat extends Mammal implements PlayfulPet {
    public static final String SPECIES = "Cat";
    public static final double LIFE_EXPECTANCY = 5500;
    public static final double BODY_TEMPERATURE = 37;

    private static final double PLAYFUL_HOURLY_COSTS = 50;
    private static final String[] LIKED_ACTIVITIES = {"eat", "nap", "groum", "drink", "crawl", "explore", "pet"};
    private static final String[] DISLIKED_ACTIVITIES = {"bath"};

    public Cat(double heightM, double weightKg, String biologicalSex){
        super(Cat.SPECIES, heightM, weightKg, Cat.LIFE_EXPECTANCY, biologicalSex, Cat.BODY_TEMPERATURE);
    }

    public String toString(){
        return super.toString() + " this is a cat";
    }

    public void meow(){
        System.out.println("Meooow");
    }

    public String getPetName(){
        return this.species;
    }

    public String play(){
        return "This cat starts rolling on the floor, and pretends to play predator";
    }

    public String playWithPerson(Person person){
        String s = "The cat stares at " + person.getName();
        s += ". After talking kin to " + person.getName() + ", " + person.getName() ;
        s += " throws a mouse toy at this cat and the cat starts chasing the mouse toy";
        return s;
    }

    public String playNoise(){
        return "Meow";
    }

    public double getRentalCosts(){
        return this.PLAYFUL_HOURLY_COSTS;
    }

    public boolean likesActivity(String activity){
        return Arrays.asList(this.LIKED_ACTIVITIES).contains(activity);
    }

    public boolean dislikesActivity(String activity){
        return Arrays.asList(this.DISLIKED_ACTIVITIES).contains(activity);
    }

    public String doActivity(String activity){
        if(activity == "eat"){
            this.eat();
            return "The cat enjoyed eating food.";
        }
        else if(activity == "nap"){
            this.sleep();
            return "The cat took a good nap";
        }
        else if(this.likesActivity(activity)) return "Meow. The cat really enjoyed the " + activity + " activity.";
        else if(this.likesActivity(activity)) return "The cat really heated the " + activity + " activity.";
        return "The cat felt indiferent about the " + activity + " activity.";
    }

}
