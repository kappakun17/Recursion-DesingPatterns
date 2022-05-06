package rideexperience.area;

import rideexperience.attraction.Attraction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;


public interface Area{
    abstract public String getAreaName();
    abstract public String areaDescription();
    abstract public HashMap<String, Attraction> createAttractionDic();
    abstract public Optional<Attraction> searchAttractionDic(String key);
    abstract public ArrayList<Attraction> getAttractionDic();
}