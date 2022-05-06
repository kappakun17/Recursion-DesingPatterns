package rentalpetshop.rentalpets.assistant;

import rentalpetshop.rentalpets.PlayfulPetAssistant;
import rentalpetshop.rentalpets.animals.Cat;
import rentalpetshop.rentalpets.PlayfulPet;

import tool.RandomWrapper;

public class PlayfulCatAssistant extends PlayfulPetAssistant {
    // ペットであるcatを返します。(オブジェクト生成)
    private final int RENTAL_LIMIT = 4;

    public PlayfulPet createPlayfulPet(){
        return new Cat(RandomWrapper.getRanDouble(0.15, 0.3), RandomWrapper.getRanDouble(2.0, 4.9), RandomWrapper.ranBoolean() ? "male": "female");
    }

    public void createPlayfulPetMultiple(int amount){
        if(amount < 1) return;
        for(int i = 0; i < amount; i++){
            PlayfulPet assistant = new Cat(RandomWrapper.getRanDouble(0.15, 0.3), RandomWrapper.getRanDouble(2.0, 4.9), RandomWrapper.ranBoolean() ? "male": "female");
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