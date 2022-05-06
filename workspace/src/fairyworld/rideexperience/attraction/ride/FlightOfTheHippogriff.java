package rideexperience.attraction.ride;

import rideexperience.attraction.Attraction;
import rideexperience.area.Area;
import rideexperience.area.WizardingWorldOfHarryPotter;
import rideexperience.stateofaffairs.StateOfAffairs;

public class FlightOfTheHippogriff implements Attraction{
    // description method
    public String description(){
        String LINE_SEPARATOR = System.getProperty("line.separator");
        String result =  "Let's flight with the creatures of the magic world!";
        result += LINE_SEPARATOR;
        result += "Do start to practice for flying after Haglid teach that Haglid Hagrid that how to get closer to a Hippogriff.";
        result += LINE_SEPARATOR;
        result += "Have a fun time you will flight with a Hippogriff!";
        return result;   
    }

    public String title(){
        return "Flight Of The Hippogriff";
    }

    public Area area(){
        return new WizardingWorldOfHarryPotter();
    }

    public String rideNarration(StateOfAffairs stateOfAffairs){
        return stateOfAffairs.getATMOSPHERE();
    }

    // satisfaction method
    public double kidFriendliness(){
        return 0.7;
    }
    public double teenFriendliness(){
        return 0.7;
    }
    public double adultFriendliness(){
        return 0.6;
    }
    public double scarriness(){
        return 0.4;
    }
    public double thrill(){
        return 0.5;
    }
    public double laughter(){
        return 0.8;
    }
    public double sightseeing(){
        return 0.9;
    }
    public double comfortableness(){
        return 0.7;
    }

    // info method
    public double averageSpeedM(){
        return 5;
    }
    public double maximumSpeed(){
        return 5.2;
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
        return "When ride on Hippogriff, do not stand up, do not remove the safety bar and do not take photo.";
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