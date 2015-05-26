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
    // Accessor/Mutator methods.
    //----------------------------------


    //-----------------------------
    // Business logic methods.
    //-----------------------------


    //------------------------------------
    // Miscellaneous other methods.
    //------------------------------------
}
