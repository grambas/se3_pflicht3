package de.hsh.se3.jpaPersistent.client;

import de.hsh.se3.client.Client;
import de.hsh.se3.jpaPersistent.entity.Customer;
import java.util.List;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import de.hsh.se3.jpaPersistent.repository.Repository;
import de.hsh.se3.transaction.beans.MoneyTransfer;
import de.hsh.se3.utils.Helper;

/**
 * client class witch demonstrates JPA persist functionality
 * @author mindau
 */
public class JpaPersistentClient implements Client{

  @Override
  public void demonstrate() throws Exception {
                    

        Repository repo =  (Repository) Helper.lookupBean(Repository.class);

        //create new demo user
        String name = "Demo_"+ System.currentTimeMillis();
        
        System.out.println("Persisting new customer with name :"+ name);
        repo.persistCustomer(name);
        
        System.out.println("Fetching all customer from database...");
        
        List<Customer> all = repo.getAllCustomers();
        for (final Customer entity : all){
            System.out.println(entity.getId()+": "+entity.getName());
        }
        
      
    }
    
    public static void main(String[] args) throws Exception {
        JpaPersistentClient sc = new JpaPersistentClient();
        sc.demonstrate();
    }
}
