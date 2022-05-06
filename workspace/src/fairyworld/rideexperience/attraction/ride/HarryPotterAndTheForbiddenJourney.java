package rideexperience.attraction.ride;

import rideexperience.attraction.Attraction;
import rideexperience.area.Area;
import rideexperience.area.WizardingWorldOfHarryPotter;
import rideexperience.stateofaffairs.StateOfAffairs;

public class HarryPotterAndTheForbiddenJourney implements Attraction{
    // description method
    public String description(){
        String LINE_SEPARATOR = System.getProperty("line.separator");
        String result =  "Let's go the adventure of magic with Harry Potter!";
        result += LINE_SEPARATOR;
        result += "Dive to the magic world, Experience of its new dimension excitement!";
        return result;   
    }

    public String title(){
        return "Harry Potter And The Forbidden Journey";
    }

    public Area area(){
        return new WizardingWorldOfHarryPotter();
    }

    public String rideNarration(StateOfAffairs stateOfAffairs){
        return stateOfAffairs.getATMOSPHERE();
    }

    // satisfaction method
    public double kidFriendliness(){
        return 0.6;
    }
    public double teenFriendliness(){
        return 0.8;
    }
    public double adultFriendliness(){
        return 0.9;
    }
    public double scarriness(){
        return 0.8;
    }
    public double thrill(){
        return 0.8;
    }
    public double laughter(){
        return 0.7;
    }
    public double sightseeing(){
        return 0.8;
    }
    public double comfortableness(){
        return 0.6;
    }

    // info method
    public double averageSpeedM(){
        return 6;
    }
    public double maximumSpeed(){
        return 6.3;
    }
    public double maximumWeight(){
        return 150;
    }
    public double mimimumHeight(){
        return 122;
    }
    public double maximumHeight(){
        return 220;
    }
    public String warnings(){
        return "When ride on coaster, do not stand up, do not remove the safety bar and do not take photo.";
    }

    public String toString(){
        String LINE_SEPARATOR = System.getProperty("line.separator");
        String result = "Welcome to "+ this.title() +"!";
        result += LINE_SEPARATOR;
        result += this.description();
        result += LINE_SEPARATOR;
        result += "Warning: " + this.warnings();
        return result;
    }
}