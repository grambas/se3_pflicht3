package de.hsh.se3.jpaPersistent.repository;

import de.hsh.se3.jpaPersistent.entity.Customer;
import java.util.List;

/**
 * Interface for RepositoryBean
 * 
 * @author mindau
 */
public interface Repository {
    public void persistCustomer(String name);
    public List<Customer> getAllCustomers();
}
