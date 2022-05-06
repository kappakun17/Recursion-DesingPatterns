
// .java/util
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.text.SimpleDateFormat;

import rentalpetshop.RentalPetShop;
import rentalpetshop.invoice.Invoice;
import rentalpetshop.invoice.InvoiceDatabase;

import rideexperience.RideExperience;

import lasertaggame.LaserTagGame;
import lasertaggame.factory.*;

import toykitshop.ToyKitShop;

import customer.Person;

class FairyWorld {

    RentalPetShop rentalPetShop = new RentalPetShop();
    RideExperience rideExperience = new RideExperience();
    LaserTagGame laserTagGame = new LaserTagGame();
    ToyKitShop toyKitShop = new ToyKitShop();

    public RentalPetShop goRentalPetShop(){
        return this.rentalPetShop;
    }

    public RideExperience goRideExperience(){
        return this.rideExperience;
    }

    public LaserTagGame goLaserTagGame(){
        return this.laserTagGame;
    }
    
    public ToyKitShop goToyKitShop(){
        return this.toyKitShop;
    }
}


public class Main{
    public static void main(String[] args){

        FairyWorld fairyWorld = new FairyWorld();
        Person jessica = new Person("Jessica", "Roller", 30, 1.65, 95, "female");
        Person mike = new Person("Mike", "Alex", 25, 1.85, 85, "male");


        // レンタルショップへ向かう
        // RentalPetShop fwRentalPetShop = fairyWorld.goRentalPetShop();

        // fwRentalPetShop.rentPet("Cat", jessica, 3, "all-rounder pack");
        // fwRentalPetShop.rentPet("Dog", jessica, 3, "all-rounder pack");
        // fwRentalPetShop.rentPet("Rabbit", mike, 2, "all-rounder pack");
        // fwRentalPetShop.displayInvoiceDatabase();

        // RideExperience fwRideExperience = fairyWorld.goRideExperience();
        // fwRideExperience.runAllRideExperience(jessica, "Super Nintendo World");
        // fwRideExperience.runAllRideExperience(mike, "Wizarding World Of Harry Potter");

        // LaserTagGame fwLaserTagGame = fairyWorld.goLaserTagGame();
        // fwLaserTagGame.playLaserTag(jessica, new GenericLaserTagMonsterFactory());
        // fwLaserTagGame.playLaserTag(jessica, new AntarcticaLaserTagMonsterFactory());
        // fwLaserTagGame.playLaserTag(jessica, new MechaLaserTagMonsterFactory());


        ToyKitShop fwToyKitShop = fairyWorld.goToyKitShop();
        fwToyKitShop.playToyKit();


    }
}
