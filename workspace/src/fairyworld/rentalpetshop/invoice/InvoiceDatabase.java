package rentalpetshop.invoice;

import java.util.ArrayList;

// 請求書データベース
public class InvoiceDatabase{
    private ArrayList<Invoice> invoiceDatabase = new ArrayList<>();

    public void addInvoiceList(Invoice invoice){
        this.invoiceDatabase.add(invoice);
    }

    public ArrayList<Invoice> getInvoiceList(){
        return this.invoiceDatabase;
    }

    public void displayAll(){
        
        for(int i = 0; i < this.invoiceDatabase.size(); i++){
            System.out.println(this.invoiceDatabase.get(i));
        }
    }
}