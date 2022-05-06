package rentalpetshop.rentalpets.assistant;

import rentalpetshop.rentalpets.PlayfulPetAssistant;
import rentalpetshop.rentalpets.animals.Dog;
import rentalpetshop.rentalpets.PlayfulPet;

import tool.RandomWrapper;


public class PlayfulDogAssistant extends PlayfulPetAssistant {
    private final int RENTAL_LIMIT = 3;

     public PlayfulPet createPlayfulPet(){
        return new Dog(RandomWrapper.getRanDouble(0.15, 0.3), RandomWrapper.getRanDouble(2.0, 4.9), RandomWrapper.ranBoolean() ? "male": "female");
    }

    public void createPlayfulPetMultiple(int amount){
        if(amount < 1) return ;
        for(int i = 0; i < amount; i++){
            PlayfulPet assistant = new Dog(RandomWrapper.getRanDouble(0.15, 0.3), RandomWrapper.getRanDouble(2.0, 4.9), RandomWrapper.ranBoolean() ? "male": "female");
            this.petAssistantList.add(assistant);
        }
    }

    // ペットの数の制限が肥えているかどうか -> boolean
    public boolean isValidPlayfulPetLimit(int amount){
        if(this.RENTAL_LIMIT >= amount) return true;
        return false;
    }

    public int getRENTAL_LIMIT(){
        return this.RENTAL_LIMIT;
    }
}