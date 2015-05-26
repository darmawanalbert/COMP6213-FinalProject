package picadillybookstore.domain;

/**
*
* @author  Albert Darmawan
* @version 1.0
* @since   2015-05-26
*/
public abstract class User {
    //------------
    // Attributes.
    //------------
    private long userId;
    private String name;
    private Gender gender;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    //----------------
    // Constructor(s).
    //----------------
    public User (long userId, String name, Gender gender, String username, String password, String email, String phoneNumber)
    {
        this.setUserId(userId);
        this.setName(name);
        this.setGender(gender);
        this.setUsername(username);
        this.setPassword(password);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
    }
    //----------------------------------
    // Accessor methods.
    //----------------------------------
    public long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    //-----------------------------
    // Mutator methods.
    //-----------------------------
    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    //-----------------------------
    // Business logic methods.
    //-----------------------------


    //------------------------------------
    // Miscellaneous other methods.
    //------------------------------------
  
}
