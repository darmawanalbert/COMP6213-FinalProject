package picadillybookstore.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
/**
* Admin.java
* This class encapsulates all attributes that an administrator has
* @author  Albert Darmawan
* @version 1.0
* @since   2015-05-26
*/

@XmlRootElement(name="admin")
public class Admin {
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
    
    public Admin ()
    {
        
    }
    public Admin(long userId, String name, Gender gender, String username, String password, String email, String phoneNumber) {
        this.userId = userId;
        this.name = name;
        this.gender = gender;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
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
    //----------------------------------
    // Mutator methods.
    //----------------------------------
    @XmlAttribute
    public void setUserId(long userId) {
        this.userId = userId;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }
    
    @XmlElement
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
    @XmlElement
    public void setUsername(String username) {
        this.username = username;
    }
    
    @XmlElement
    public void setPassword(String password) {
        this.password = password;
    }
    
    @XmlElement
    public void setEmail(String email) {
        this.email = email;
    }
    
    @XmlElement
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
 
    //------------------------------------
    // Miscellaneous other methods.
    //------------------------------------
    public void display()
    {
        System.out.println("User ID      : " + this.getUserId());
        System.out.println("Name         : " + this.getName());
        System.out.println("Gender       : " + this.getGender());
        System.out.println("Username     : " + this.getUsername());
        System.out.println("Email        : " + this.getEmail());
        System.out.println("Phone Number : " + this.getPhoneNumber());
        System.out.println("");
        System.out.println("");
    }
}
