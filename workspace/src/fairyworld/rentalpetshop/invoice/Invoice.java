package rentalpetshop.invoice;

import java.util.Date;
import java.text.SimpleDateFormat;


// 請求書メーカー
public class Invoice{
    private String name;
    // private String explain;
    private double total = 0;
    private String assistantPetName;
    private int numOfPets = 0;
    private String tourPlan;
    private Date createDate;

    public Invoice(String name, double total, String assistantPetName, int numOfPets, String tourPlan){
        this.name = name;
        this.total = total;
        this.assistantPetName = assistantPetName;
        this.numOfPets = numOfPets;
        this.tourPlan = tourPlan;
        this.createDate = new Date();
    }

    public String getInvoiceName(){
        return this.name;
    }

    // public String getInvoiceExplain(){
    //     return this.explain;
    // }

    public double getInvoiceTotal(){
        return this.total;
    }

    public String getInvoiceAssistantPetName(){
        return this.assistantPetName;
    }

    public int getInvoiceNumOfPets(){
        return this.numOfPets;
    }
    public String getInvoiceTourPlan(){
        return this.tourPlan;
    }

    public Date getInvoiceCreateDate(){
        return this.createDate;
    }

    public String getDateFormat(){
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy / MM / dd hh:mm:ss");
        return formatDate.format(this.getInvoiceCreateDate());
    }

    public String toString(){
        String result = "**********************\n";
        result += "--- The Invoice of Fairy World ---\n\n";
        result += "Created: " + this.getDateFormat() + "\n\n";
        result += "Sign name: " + this.getInvoiceName() + "\n\n";
        result += "Tour plan: " + this.getInvoiceTourPlan() + "\n\n";
        result += "Rental pets: " + this.getInvoiceAssistantPetName() + " / " + String.valueOf(this.getInvoiceNumOfPets()) + "\n\n";
        // result += "Explain: " + this.getInvoiceExplain() + "\n\n";
        result += "Total: " + String.valueOf(this.getInvoiceTotal()) + " dollars \n";
        result += "**********************\n";
        return result;
    }
}