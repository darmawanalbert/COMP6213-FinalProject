package picadillybookstore.domain;

/**
*
* @author  Albert Darmawan
* @version 1.0
* @since   2015-05-26
*/
import java.util.ArrayList;

public class Customer extends User{
    //------------
    // Attributes.
    //------------
    private int numberOfPurchase;
    private String streetAddress;
    private String city;
    private String zipCode;
    private String country;
    private String creditCardName;
    private String creditCardNo;
    private String cvc;
    private String creditCardMonth;
    private String creditCardYear;
    ArrayList<Book> purchasedBook = new ArrayList<>();
    //----------------
    // Constructor(s).
    //----------------

    /**
     *
     * @param userId
     * @param name
     * @param gender
     * @param username
     * @param password
     * @param email
     * @param phoneNumber
     * @param numberOfPurchase
     * @param streetAddress
     * @param city
     * @param zipCode
     * @param country
     * @param creditCardName
     * @param creditCardNo
     * @param cvc
     * @param creditCardMonth
     * @param creditCardYear
     */
     public Customer(long userId, String name, 
                Gender gender, String username, 
                String password, String email, 
                String phoneNumber, int numberOfPurchase, String streetAddress,
                String city, String zipCode, String country, String creditCardName,
                String creditCardNo, String cvc, String creditCardMonth, String creditCardYear)
    {
        super(userId,name,gender,username,password,email,phoneNumber);
        this.setNumberOfPurchase(numberOfPurchase);
        this.setStreetAddress(streetAddress);
        this.setCity(city);
        this.setZipCode(zipCode);
        this.setCountry(country);
        this.setCreditCardName(creditCardName);
        this.setCreditCardNo(creditCardNo);
        this.setCvc(cvc);
        this.setCreditCardMonth(creditCardMonth);
        this.setCreditCardYear(creditCardYear);           
    }
    //----------------------------------
    // Accessor methods.
    //----------------------------------
    public int getNumberOfPurchase() {
        return numberOfPurchase;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCreditCardName() {
        return creditCardName;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public String getCvc() {
        return cvc;
    }

    public String getCreditCardMonth() {
        return creditCardMonth;
    }

    public String getCreditCardYear() {
        return creditCardYear;
    }
    
    public ArrayList<Book> getPurchasedBook() {
        return purchasedBook;
    }    
    
    //----------------------------------
    // Mutator methods.
    //----------------------------------
    public void setNumberOfPurchase(int numberOfPurchase) {
        this.numberOfPurchase = numberOfPurchase;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCreditCardName(String creditCardName) {
        this.creditCardName = creditCardName;
    }

    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public void setCreditCardMonth(String creditCardMonth) {
        this.creditCardMonth = creditCardMonth;
    }

    public void setCreditCardYear(String creditCardYear) {
        this.creditCardYear = creditCardYear;
    } 
    
    public void setPurchasedBook(ArrayList<Book> purchasedBook) {
        this.purchasedBook = purchasedBook;
    }
    
    //-----------------------------
    // Business logic methods.
    //-----------------------------


    //------------------------------------
    // Miscellaneous other methods.
    //------------------------------------




    

    
}
