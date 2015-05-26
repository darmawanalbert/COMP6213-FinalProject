package picadillybookstore.domain;

/**
*
* @author  Albert Darmawan
* @version 1.0
* @since   2015-05-26
*/
public class Customer extends User{
    //------------
    // Attributes.
    //------------
    private int numberOfOrder;
    private String streetAddress;
    private String city;
    private String zipCode;
    private String country;
    private String creditCardName;
    private String creditCardNo;
    private String cvc;
    private String creditCardMonth;
    private String creditCardYear;
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
     * @param numberOfOrder
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
                String phoneNumber, int numberOfOrder, String streetAddress,
                String city, String zipCode, String country, String creditCardName,
                String creditCardNo, String cvc, String creditCardMonth, String creditCardYear)
    {
        super(userId,name,gender,username,password,email,phoneNumber);
        this.setNumberOfOrder(numberOfOrder);
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
    public int getNumberOfOrder() {
        return numberOfOrder;
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

    //----------------------------------
    // Mutator methods.
    //----------------------------------
    public void setNumberOfOrder(int numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
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
     
    //-----------------------------
    // Business logic methods.
    //-----------------------------


    //------------------------------------
    // Miscellaneous other methods.
    //------------------------------------

    

    
}
