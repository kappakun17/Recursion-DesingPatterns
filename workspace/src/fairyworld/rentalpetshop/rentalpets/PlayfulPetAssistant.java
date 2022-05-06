package rentalpetshop.rentalpets;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import rentalpetshop.rentalpets.animals.Cat;
import rentalpetshop.rentalpets.animals.Dog;
import rentalpetshop.rentalpets.animals.Rabbit;

import customer.Person;


import tool.RandomWrapper;

// import rentalpetshop.rentalpets.PlayfulPet;

public abstract class PlayfulPetAssistant {
    protected static final double DEFAULT_RENT_TIME = 1.0;
    protected static final String DEFAUTL_TOUR = "all-rounder pack";

    protected Person currentPerson;
    protected double currentRentTime = PlayfulPetAssistant.DEFAULT_RENT_TIME;
    protected static String[] availableActivities = {"eat", "walk", "drink", "nap", "pet", "run", "explore"};
    protected static String[] availableTours = {"all-rounder pack", "deluxe rounder pack"};
    
    // 複数レンタルするペットのオブジェクト格納リスト
    protected ArrayList<PlayfulPet> petAssistantList = new ArrayList<>();

    public String[] getActivities(){
        return this.availableActivities;
    }

    public String[] getAvailableTours(){
        return this.availableTours;
    }

    public boolean isValidTour(String tour){
        return Arrays.asList(this.getAvailableTours()).contains(tour);
    }

    protected String getRandomActivity(){
        List<String> activities = Arrays.asList(this.getActivities());
        int ran = new Random().nextInt(activities.size());
        return activities.get(ran);
    }

    public void setPerson(Person person){
        this.currentPerson = person;
    }

    public void setHours(double hours){
        this.currentRentTime = hours;
    }

    public double getCurrentRentTime(){
        return this.currentRentTime;
    }

    public ArrayList getPetAssistantList(){
        return this.petAssistantList;
    }

    public void reset(){
        this.currentPerson = null;
        this.currentRentTime = this.DEFAULT_RENT_TIME;
    }

    // runAssistanceTourは、ペットをレンタルしている間に、personのサポートに関する全体のアルゴリズムを実行する関数です。
    // public double runAssistanceTour(Person person, String tour){
    //     if(tour == null) tour = this.DEFAUTL_TOUR;
    //     return this.runAssistanceTour(person, tour);
    // }

    public double runAssistanceTourMultiple(Person person, String tour, int amount){
        // 複数のペット作成
        this.createPlayfulPetMultiple(amount);

        if(tour == null) tour = this.DEFAUTL_TOUR;
        double totalCosts = 0;
        for(int i = 0; i < this.petAssistantList.size(); i++){
            totalCosts += this.runAssistanceTour(person, tour, this.petAssistantList.get(i));
        }

        return totalCosts;
    }

    public double runAssistanceTour(Person person, String tour){
        PlayfulPet playfulPet = this.createPlayfulPet();
        return runAssistanceTour(person, tour, playfulPet);
    }

    public double runAssistanceTour(Person person, String tour, PlayfulPet playfulPet){
        if(!this.isValidTour(tour)) System.out.println("The tour guide does not accept the " + tour + " tour.");

        // // factory methodを使ってペットを作成します。サブクラスは、このクラスを拡張し、独自のfactory methodを作成して、特定のペットを作成します。\\
        // PlayfulPet playfulPet = this.createPlayfulPet();

        System.out.println("");
        System.out.println("Booting up... Playful Pet Assistance robot at your service.");
        System.out.println("Printing information about the Person to service ... " + person);
        System.out.println("");
        System.out.println("Printing information about the Playful Pet - " + playfulPet.getPetName() + " to service... " + playfulPet);

        if(tour == "all-rounder pack" || tour == "deluxe rounder pack"){
            int count = tour == "all-rounder pack" ? 1 : 3;
            this.genericRounderTour(count, person, playfulPet);
        }

        else{
            System.out.println("The assistant robot for " + playfulPet.getPetName() + " and " + person.getName() + " did nothing.");
        }

        double rentalCosts = playfulPet.getRentalCosts() * this.getCurrentRentTime();

        // ツアーが終了すると、このアシスタントロボットをリセットします。
        this.reset();

        // レンタルにいくらかかったか返します。
        return rentalCosts;
    }

    private void genericRounderTour(int activityCount, Person person, PlayfulPet pet){
        String newLine = System.lineSeparator();
        System.out.println(newLine + "Now starting the generic rounder tour with " + activityCount + "acitivity(s)");
        System.out.println(person.getName() + " greets " + pet.getPetName() + newLine);
        System.out.println(pet.play() + newLine);
        System.out.println(pet.playWithPerson(person) + newLine);
        for(int i = 0; i < activityCount ; i++){
            String activity = this.getRandomActivity();
            System.out.println(pet.getPetName() + " will now " + activity);
            System.out.println("--------");
            System.out.println(pet.doActivity(activity));
            System.out.println("--------" + newLine);
        }
    }

    // factory method  => creation Pet Object
    public abstract PlayfulPet createPlayfulPet();
    public abstract void createPlayfulPetMultiple(int amount);
    public abstract boolean isValidPlayfulPetLimit(int amount);
    public abstract int getRENTAL_LIMIT();
}

