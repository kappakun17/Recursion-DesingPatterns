package rideexperience.area;

import rideexperience.area.Area;
import rideexperience.attraction.Attraction;
import rideexperience.attraction.ride.HarryPotterAndTheForbiddenJourney;
import rideexperience.attraction.ride.FlightOfTheHippogriff;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;


public class WizardingWorldOfHarryPotter implements Area{
    HashMap<String, Attraction> attractionDic = this.createAttractionDic();
    public String getAreaName(){
        return "Wizarding World Of HarryPotter";
    }

    public String areaDescription(){
        String result = "Everything is magic and reality.";
        result += "This is a magnificent area where recreates the world of the Harry Potter story.";
        result += "You can actually enjoy 'that world' here.";
        return result;
    }

    public HashMap<String, Attraction> createAttractionDic(){
        HashMap<String, Attraction> attractionDic = new HashMap<>();
        attractionDic.put("Harry Potter And The Forbidden Journey", new HarryPotterAndTheForbiddenJourney());
        attractionDic.put("Flight Of The Hippogriff", new FlightOfTheHippogriff());
        return attractionDic;
    }

    public Optional<Attraction> searchAttractionDic(String key){
        Attraction result = null;
        if(this.attractionDic.containsKey(key)){
            result = this.attractionDic.get(key);
        }
        return Optional.ofNullable(result);
    }

    public ArrayList<Attraction> getAttractionDic(){
        ArrayList<Attraction> attractionList = new ArrayList<>();
        for(Attraction attraction : this.attractionDic.values()){
            attractionList.add(attraction);
        }

        return attractionList;
    }
}