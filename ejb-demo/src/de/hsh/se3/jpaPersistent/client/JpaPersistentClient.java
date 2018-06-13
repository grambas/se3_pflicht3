package de.hsh.se3.jpaPersistent.client;

import de.hsh.se3.jpaPersistent.entity.Customer;
import java.util.List;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import de.hsh.se3.jpaPersistent.repository.Repository;

/**
 * client class witch demonstrates JPA persist functionality
 * @author mindau
 */
public class JpaPersistentClient {

  public void demonstrate() throws Exception {
        Properties prop = new Properties();
        Context jndiContext = new InitialContext(prop);
        Repository repo = 
                (Repository) jndiContext.lookup(Repository.class.getName());

        //create new demo user
        String name = "Demo_"+ System.currentTimeMillis();
        
        System.out.println("Persisting new customer with name :"+ name);
        repo.persistCustomer(name);
        
        System.out.println("Fetching all customer from database...");
        
        List<Customer> all = repo.getAllCustomers();
        for (final Customer entity : all){
            System.out.println(entity.getId()+": "+entity.getName());
        }
        
        System.out.println("Jpa Persistence demo done.");
      
    }
    
    public static void main(String[] args) throws Exception {
        JpaPersistentClient sc = new JpaPersistentClient();
        sc.demonstrate();
    }
}
