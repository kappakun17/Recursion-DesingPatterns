package rideexperience.stateofaffairs;

import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;

import tool.RandomWrapper;


public class StateOfAffairs{

    private RandomWrapper rw = new RandomWrapper();
    private final Date CREATE_DATE;
    private final int  NUM_OF_PEOPLE;
    private final double TEMPERATURE;
    private final int LEVEL_OF_LOUDNESS;

    private final String ATMOSPHERE;

    public StateOfAffairs(){
        this.CREATE_DATE = new Date();

        this.NUM_OF_PEOPLE = this.rw.getRanInt(100, 1000);
        this.TEMPERATURE = this.rw.getRanDouble(10.0, 35.0);
        this.LEVEL_OF_LOUDNESS = setLEVEL_OF_LOUDNESS(this.NUM_OF_PEOPLE);
        this.ATMOSPHERE = setATMOSPHERE(this.NUM_OF_PEOPLE, this.TEMPERATURE, this.LEVEL_OF_LOUDNESS);

    }

    public Date getCREATE_DATE(){
        return this.CREATE_DATE;
    }

    public String getDateFormat(){
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy / MM / dd hh:mm:ss");
        return formatDate.format(this.getCREATE_DATE());
    }

    public int getNUM_OF_PEOPLE(){
        return this.NUM_OF_PEOPLE;
    }

    public double getTEMPERATURE(){
        return this.TEMPERATURE;
    }

    public int setLEVEL_OF_LOUDNESS(int numOfPeople){
        if(numOfPeople < 900) return 9;
        if(numOfPeople < 800) return 8;
        if(numOfPeople < 700) return 7;
        if(numOfPeople < 600) return 6;
        if(numOfPeople < 500) return 5;
        if(numOfPeople < 400) return 4;
        if(numOfPeople < 300) return 3;
        if(numOfPeople < 200) return 2;
        else return 1;
    }

    public int getLEVEL_OF_LOUDNESS(){
        return this.LEVEL_OF_LOUDNESS;
    }

    public String setATMOSPHERE(final int numOfPeople, final double temperature, final int levelOfLoudness){
        String result = "The area is ";

        // 混雑度
        if(numOfPeople < 700) result += "crowded, ";
        else if(numOfPeople < 400) result += "not crowded, ";
        else result += "empty, ";

        result += "the temperature is ";

        // 温度
        if(temperature < 28.0) result += "very hot, ";
        else if(temperature < 24.0) result += "not very hot, ";
        else if(temperature < 18.0) result += "comfortable, ";
        else result += "cold, ";

        // 雑音度
        result += "the loudness is ";
        if(levelOfLoudness < 7) result += "too noisy, can't listen for nomal voice";
        else if(levelOfLoudness < 5 ) result += "normal, can listen for normal voice";
        else if(levelOfLoudness < 2) result += "not noisy, can listen for small voice";
        else result += "quite";

        result += ".";

        return result;
    }

    public String getATMOSPHERE(){
        return this.ATMOSPHERE;
    }

    
}