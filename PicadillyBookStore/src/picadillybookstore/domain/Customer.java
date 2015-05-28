package picadillybookstore.domain;

/**
*
* @author  Albert Darmawan
* @version 1.0
* @since   2015-05-26
*/
import java.util.ArrayList;
import java.util.Calendar;

public class Customer extends User{
    //------------
    // Constant(s).
    //------------
    public final int NUMBER_OF_CREDIT_CARD_SUBSTRING = 4;
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
    private String getZipCode;

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
    public boolean isCreditCardNumberValid()
    {
        // Using Luhn Algorithm
        int sum = 0;
        boolean alternate = false;
        for (int i = this.getCreditCardNo().length() - 1; i >= 0; i--)
        {
                int n = Integer.parseInt(this.getCreditCardNo().substring(i, i + 1));
                if (alternate)
                {
                        n *= 2;
                        if (n > 9)
                        {
                                n = (n % 10) + 1;
                        }
                }
                sum += n;
                alternate = !alternate;
        }
        return (sum % 10 == 0);
    }
    
    public PurchaseStatus purchaseBook(Book bookBeingPurchased)
    {
        Calendar currentTime = Calendar.getInstance();
        int currentYear = currentTime.get(Calendar.YEAR);
        int currentMonth = currentTime.get(Calendar.MONTH)+1;
        String creditCardYearFourDigit = "20"+this.getCreditCardYear();
        int creditCardYearInteger = Integer.parseInt(creditCardYearFourDigit);
        int creditCardMonthInteger = Integer.parseInt(this.getCreditCardMonth());
        if (bookBeingPurchased.getQuantity()!=0)
        {
            if (currentMonth<=creditCardMonthInteger && currentYear<=creditCardYearInteger && isCreditCardNumberValid())
            {
                bookBeingPurchased.quantity-=1;
                this.setNumberOfPurchase(this.getNumberOfPurchase()+1);
                purchasedBook.add(bookBeingPurchased);
                return PurchaseStatus.success;
            }
            else 
            {
                return PurchaseStatus.creditCardInvalid;
            }
        }
        else {
            return PurchaseStatus.noStock;
        }
    }

    //------------------------------------
    // Miscellaneous other methods.
    //------------------------------------

    public void display()
    {
        System.out.println("Personal Information");
        System.out.println("---------------------------------------------");
        System.out.println("Name               : " + this.getName());
        System.out.println("User ID            : " + this.getUserId());
        System.out.println("Gender             : " + this.getGender());
        System.out.println("Username           : " + this.getUsername());
        System.out.println("Email              : " + this.getEmail());
        System.out.println("Phone Number       : " + this.getPhoneNumber());
        System.out.println("Number of Purchase : " + this.getNumberOfPurchase());
        System.out.println("Address            : " + this.getStreetAddress() + "\n\t             " + this.getCity() + " , "+ this.getZipCode() + "\n\t             " + this.getCountry());
        System.out.println("");
        System.out.println("Credit Card Information");
        System.out.println("---------------------------------------------");
        System.out.println("Name               : " + this.getCreditCardName());
        System.out.print("No                 : ");
        for (int loopCounter=0;loopCounter<NUMBER_OF_CREDIT_CARD_SUBSTRING;loopCounter++)
        {
            System.out.print(this.getCreditCardNo().substring(loopCounter*NUMBER_OF_CREDIT_CARD_SUBSTRING,(loopCounter*NUMBER_OF_CREDIT_CARD_SUBSTRING)+NUMBER_OF_CREDIT_CARD_SUBSTRING));
            if (loopCounter!=NUMBER_OF_CREDIT_CARD_SUBSTRING-1)
            {
                System.out.print("-");
            }
        }
        System.out.println("");
        System.out.println("Expired Date       : " + this.getCreditCardMonth() + "/" + this.getCreditCardYear());
        
        
        System.out.println("");
        System.out.println("");
    }
}
