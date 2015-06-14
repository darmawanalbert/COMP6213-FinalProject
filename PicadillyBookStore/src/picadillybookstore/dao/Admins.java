/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picadillybookstore.dao;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import picadillybookstore.domain.Admin;
/**
 * Admins.java
 * This class is the container of Admin List<>
 * @author  Albert Darmawan
 * @version 1.0
 * @since   2015-06-13
 */
@XmlRootElement(name="admins")
@XmlAccessorType(XmlAccessType.FIELD)
public class Admins {
    //------------
    // Attribute
    //------------
    @XmlElement(name="admin")
    private List<Admin> admins = null;
    /**
     *
     * @return
     */
    
    //------------
    // Accessor
    //------------
    public List<Admin> getAdmins()
    {
        return admins;
    }
    
    //------------
    // Mutator
    //------------
    public void setAdmins(List<Admin> admins)
    {
        this.admins  =admins;
    }
}
