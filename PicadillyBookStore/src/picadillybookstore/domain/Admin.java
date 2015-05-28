package picadillybookstore.domain;

/**
*
* @author  Albert Darmawan
* @version 1.0
* @since   2015-05-26
*/
public class Admin extends User{
    //------------
    // Attributes.
    //------------
        
    //----------------
    // Constructor(s).
    //----------------
    public Admin (long userId, String name, Gender gender, String username, String password, String email, String phoneNumber)
    {
        super(userId,name,gender,username,password,email,phoneNumber);
    }
    
    //----------------------------------
    // Accessor methods.
    //----------------------------------

    //----------------------------------
    // Mutator methods.
    //----------------------------------
    
    //-----------------------------
    // Business logic methods.
    //-----------------------------


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
