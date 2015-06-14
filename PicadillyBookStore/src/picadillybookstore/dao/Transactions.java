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
import picadillybookstore.domain.Transaction;
/**
 *
 * @author  Albert Darmawan
 * @version 1.0
 * @since   2015-06-14
 */

@XmlRootElement(name="transactions")
@XmlAccessorType(XmlAccessType.FIELD)
public class Transactions {
    @XmlElement(name="transaction")
    private List<Transaction> transactions = null;
    public List<Transaction> getTransactions()
    {
        return transactions;
    }
    public void setTransactions(List<Transaction> transactions)
    {
        this.transactions  =transactions;
    }
}
