package rentalpetshop;

import java.util.HashMap;

import rentalpetshop.rentalpets.PlayfulPetAssistant;
import rentalpetshop.invoice.Invoice;
import rentalpetshop.invoice.InvoiceDatabase;
import rentalpetshop.rentalpets.assistant.PlayfulCatAssistant;;
import rentalpetshop.rentalpets.assistant.PlayfulDogAssistant;
import rentalpetshop.rentalpets.assistant.PlayfulRabbitAssistant;


import customer.Person;

public class RentalPetShop {
    private HashMap<String, PlayfulPetAssistant> playfulPetAssistantDic = new HashMap<>();
    private InvoiceDatabase invoiceDatabase = new InvoiceDatabase();

    public void rentPet(String petKey, Person person, int amount, String tour){
        // Pet assistantの辞書起動
        this.createPlayfulPetAssistantDic();
        
        PlayfulPetAssistant assistantPet = this.searchPlayfulPetAssistant(petKey);
        // ペットの量が１，０、1以上の場合
        double cost = 0;

        if(amount < 1){
            System.out.println("Please input amount of assistant pet you would like to rent.");
            return ;
        }

        if(!assistantPet.isValidPlayfulPetLimit(amount)){
            System.out.println("*******************************");
            System.out.println("Thank you for your pet rental!");
            System.out.println("You can rental max" + assistantPet.getRENTAL_LIMIT() + " " + petKey + "s.");
            System.out.println("Please change amount of assistant pet.");
            System.out.println("*******************************");
            return ;
        }

        if(amount > 1){ 
            cost = assistantPet.runAssistanceTourMultiple(person, tour, amount);
        
        }else if(amount == 1){
            cost = assistantPet.runAssistanceTour(person, tour);
        }
        

        System.out.println("Thank you for your pet rental!");
        System.out.println(cost + " dollars were charged to "  + person.getName() + "'s credit card.");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxx" + System.lineSeparator());

        // 請求書作成
        Invoice invoice = createInvoice(person, cost, petKey, amount, tour);
        invoiceDatabase.addInvoiceList(invoice);
    }

    public void createPlayfulPetAssistantDic(){
        this.playfulPetAssistantDic.put("Cat", new PlayfulCatAssistant());
        this.playfulPetAssistantDic.put("Dog", new PlayfulDogAssistant());
        this.playfulPetAssistantDic.put("Rabbit", new PlayfulRabbitAssistant());
    }
 
    public void addPlayfulPetAssistant(String key, PlayfulPetAssistant assistantPet){
        this.playfulPetAssistantDic.put(key, assistantPet);
    }

    public PlayfulPetAssistant searchPlayfulPetAssistant(String petKey){
        if(this.playfulPetAssistantDic.containsKey(petKey)) return this.playfulPetAssistantDic.get(petKey);
        return null;
        
    }

    public Invoice createInvoice(Person person, double total, String assistantPetName, int numOfPets, String tourPlan){
        String name = person.getName();
        return new Invoice(name, total, assistantPetName, numOfPets, tourPlan);

    }

    public void displayInvoiceDatabase(){
        this.invoiceDatabase.displayAll();
    }
}