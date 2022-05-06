package rideexperience;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Optional;

import rideexperience.area.Area;
import rideexperience.area.NintendoWorld;
import rideexperience.area.WizardingWorldOfHarryPotter;
import rideexperience.attraction.Attraction;
import rideexperience.stateofaffairs.StateOfAffairs;
import customer.Person;

public class RideExperience{
    private HashMap<String, Area> areaDic = new HashMap<>();

    // 乗り物指定
    public void runRideExperience(Person person, String areaKey, String attractionKey){
        this.createAreaDic();
        // search the area.
        Optional<Area> optArea = this.searchAreaDic(areaKey);
        if(!optArea.isPresent()){
            System.out.println("The area you specified can not found.");
            return;
        }
        Area goArea = optArea.get();
        this.comeArea(goArea);
        // search the attraction.
        Optional<Attraction> optAtt = goArea.searchAttractionDic(attractionKey);
        if(!optAtt.isPresent()){
            System.out.println("The attraction you specified can not found");
            return;
        }
        Attraction goAttraction = optAtt.get();
        
        this.ride(person, goAttraction, this.getStateOfAffairs());
    }

    // エリアにある乗り物に全部乗るとき
    public void runAllRideExperience(Person person, String area){
        this.createAreaDic();
        Optional<Area> opt = this.searchAreaDic(area);
        if(!opt.isPresent()){
            System.out.println("The area you specified can not found.");
        }
        Area goArea = opt.get();
        this.comeArea(goArea);
        ArrayList<Attraction> attractions = goArea.getAttractionDic();

        for(int i = 0; i < attractions.size();i++){
            this.ride(person, attractions.get(i), this.getStateOfAffairs());
        }
    }

    // エリアの案内
    public void comeArea(Area area){
        System.out.println("🎡🎡🎡🎡🎡🎡🎡🎡🎡");
        System.out.println("Welcome to " + area.getAreaName()+"!");
        System.out.println(area.areaDescription());
        System.out.println("🎡🎡🎡🎡🎡🎡🎡🎡🎡");
    }

    // 1つのattractionに乗る過程
    public void ride(Person person, Attraction attraction, StateOfAffairs stateOfAffairs){
        System.out.println("🎠🎠🎠🎠🎠🎠🎠🎠🎠🎠");
        System.out.println(attraction);
        System.out.println(attraction.rideNarration(stateOfAffairs));
        System.out.println("......is playing......");
        System.out.println("Thank you for riding " + attraction.title() + "!");
        System.out.println("🎠🎠🎠🎠🎠🎠🎠🎠🎠🎠");
        System.out.println("");
    }

    public void createAreaDic(){
        this.areaDic.put("Super Nintendo World", new NintendoWorld());
        this.areaDic.put("Wizarding World Of Harry Potter", new WizardingWorldOfHarryPotter());
    }

    public Optional<Area> searchAreaDic(String key){
        Area result = null;
        if(this.areaDic.containsKey(key)){
            result = this.areaDic.get(key);
        }
        return Optional.ofNullable(result);
    }

    public StateOfAffairs getStateOfAffairs(){
        return new StateOfAffairs();
    }

    

}