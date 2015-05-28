package picadillybookstore.domain;

import java.util.Date;

/**
 *
 * @author RAZER
 */
public class Transaction{
    //Attributes
    private long transactionId;
    private long customerId;
    private String isbn;
    private long quantity;
    private Date date;
    public boolean paymentVerification(){
        if()
    
        else
            }
    
   //Accessor
    public long getTransactionId(){
        return transactionId;
    }
    public long getCustomerId(){
        return customerId;
    }
    public String getIsbn(){
        return isbn;
    }
    public long getQuantity(){
        return quantity;
    }
    //Mutator
    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
 
}
 
