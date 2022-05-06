package rideexperience.area;

import rideexperience.area.Area;
import rideexperience.attraction.Attraction;
import rideexperience.attraction.ride.MarioKart;
import rideexperience.attraction.ride.YoshiAdventure;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

public class NintendoWorld implements Area{
    
    HashMap<String, Attraction> attractionDic = this.createAttractionDic();
    public String getAreaName(){
        return "Super Nintendo World";
    }

    public String areaDescription(){
        String result = "#We Are Mario!! Do release your playing instinct!";
        result += " When serious fight with someone, work with friend and get hocked and play, most of people can be make nice emotion.";
        result += " Yes, everyone was born for playing here.";
        return result;
    }

    public HashMap<String, Attraction> createAttractionDic(){
        HashMap<String, Attraction> attractionDic = new HashMap<>();
        attractionDic.put("Mario Kart", new MarioKart());
        attractionDic.put("Yoshi Adventure", new YoshiAdventure());
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

