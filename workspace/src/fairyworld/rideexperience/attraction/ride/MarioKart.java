package rideexperience.attraction.ride;

import rideexperience.attraction.Attraction;
import rideexperience.area.Area;
import rideexperience.area.NintendoWorld;
import rideexperience.stateofaffairs.StateOfAffairs;



public class MarioKart implements Attraction{
    // description method
    public String description(){
        String LINE_SEPARATOR = System.getProperty("line.separator");
        String result =  "A lot of amazing courses in the world of Mario Kart will appear in front of you!";
        result += LINE_SEPARATOR;
        result += "Throw these and push forward with Mario and Princess Peach while repelling the enemy!";
        return result;   
    }

    public String title(){
        return "Mario Kart";
    }

    public Area area(){
        return new NintendoWorld();
    }

    public String rideNarration(StateOfAffairs stateOfAffairs){
        return stateOfAffairs.getATMOSPHERE();
    }

    // satisfaction method
    public double kidFriendliness(){
        return 0.8;
    }
    public double teenFriendliness(){
        return 0.8;
    }
    public double adultFriendliness(){
        return 0.7;
    }
    public double scarriness(){
        return 0.8;
    }
    public double thrill(){
        return 0.8;
    }
    public double laughter(){
        return 0.9;
    }
    public double sightseeing(){
        return 0.4;
    }
    public double comfortableness(){
        return 0.7;
    }

    // info method
    public double averageSpeedM(){
        return 8.3;
    }
    public double maximumSpeed(){
        return 9.5;
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
        return "When ride on kart, do not stand up, do not remove the safety bar and do not take photo.";
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