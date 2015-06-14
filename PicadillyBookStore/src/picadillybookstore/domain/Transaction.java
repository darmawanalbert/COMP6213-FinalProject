package picadillybookstore.domain;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * Transaction.java
 * This class encapsulates all attributes that a transaction has
 * @author Matthew Kharli
 * @version 1.0
 * @since 2015-5-28
 */

@XmlRootElement(name="transaction")
@XmlAccessorType(XmlAccessType.FIELD)
public class Transaction {
    
    //------------
    // Attributes.
    //------------
    private long transactionId;
    private long customerId;
    private String isbn;
    private long quantity;
    private Date date;
    public boolean paymentVerification;
 
    //----------------
    // Constructor(s).
    //----------------
    public Transaction()
    {
        
    }
    
    public Transaction(long transactionId, long customerId, String isbn, long quantity, Date date, boolean paymentVerification) {
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.isbn = isbn;
        this.quantity = quantity;
        this.date = date;
        this.paymentVerification = paymentVerification;
    }    
    
    //----------------------------------
    // Accessor methods.
    //----------------------------------
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

    public Date getDate() {
        return (Date) this.date.clone();
    }
    
    public boolean isPaymentVerification() {
        return paymentVerification;
    }
    
    //----------------------------------
    // Mutator methods.
    //----------------------------------
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
      
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    
    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
    
    public void setDate(Date date) {
        this.date = (Date) date.clone();
    }
    
    public void setPaymentVerification(boolean paymentVerification) {
        this.paymentVerification = paymentVerification;
    }
    
    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    //------------------------------------
    // Miscellaneous other methods.
    //------------------------------------
    public void display()
    {
        System.out.println("Transaction ID       : " + this.getTransactionId());
        System.out.println("Customer ID          : " + this.getCustomerId());
        System.out.println("ISBN                 : " + this.getIsbn());
        System.out.println("Quantity             : " + this.getQuantity());
        System.out.println("Date                 : " + this.getDate());
        System.out.print("Payment Verification : ");
        if(this.isPaymentVerification()==true) 
        {
            System.out.println("Verified");
        }
        else 
        {
            System.out.println("Not verified");
        }
        System.out.println("");
    }
}
 
