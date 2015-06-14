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
import picadillybookstore.domain.Customer;
/**
 * Customers.java
 * This class is the container of Customer List<>
* @author  Albert Darmawan
* @version 1.0
* @since   2015-06-06
 */
@XmlRootElement(name="customers")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customers {
    //------------
    // Attribute
    //------------
    @XmlElement(name="customer")
    private List<Customer> customers;
    /**
     *
     * @return
     */
    
    //------------
    // Accessor
    //------------
    public List<Customer> getCustomers()
    {
        return customers;
    }
    
    //------------
    // Mutator
    //------------
    public void setCustomers(List<Customer> customers)
    {
        this.customers  =customers;
    }
}
