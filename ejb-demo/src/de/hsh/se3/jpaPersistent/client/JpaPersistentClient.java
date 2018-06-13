package de.hsh.se3.jpaPersistent.client;

import de.hsh.se3.client.Client;
import de.hsh.se3.jpaPersistent.entity.Customer;
import java.util.List;
import de.hsh.se3.jpaPersistent.repository.Repository;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * client class witch demonstrates JPA persist functionality
 *
 * @author mindau
 */
public class JpaPersistentClient implements Client {

    @Override
    public void demonstrate() throws Exception {
        Repository repo;
        try {
            Context c = new InitialContext();
            repo = (Repository) c.lookup(Repository.class.getName());
        } catch (NamingException ne) {
            System.out.println("exception caught:" + ne.getMessage());
            throw new RuntimeException(ne);
        }

        //create new demo user
        String name = "Demo_" + System.currentTimeMillis();

        System.out.println("Persisting new customer with name :" + name);
        repo.persistCustomer(name);

        System.out.println("Fetching all customer from database...");

        List<Customer> all = repo.getAllCustomers();
        for (final Customer entity : all) {
            System.out.println(entity.getId() + ": " + entity.getName());
        }

    }

    public static void main(String[] args) throws Exception {
        JpaPersistentClient sc = new JpaPersistentClient();
        sc.demonstrate();
    }
}
