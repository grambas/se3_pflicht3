package de.hsh.se3.jpaPersistent.repository;

import de.hsh.se3.jpaPersistent.entity.Customer;
import java.util.List;
import javax.ejb.Remote;

/**
 * Interface for RepositoryBean
 *
 * @author mindau
 */
@Remote
public interface Repository {

    public void persistCustomer(String name);

    public List<Customer> getAllCustomers();
}
