package de.hsh.se3.jpaPersistent.repository;

import de.hsh.se3.jpaPersistent.entity.Customer;
import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mindau
 */
@Stateless
@Remote(Repository.class)
public class RepositoryBean implements Repository {

    //Inject Entitymanager
    @PersistenceContext
    private EntityManager em;

    @Override
    public void persistCustomer(String name) {

        Customer customer = new Customer();
        customer.setName(name);
        em.persist(customer);
        em.flush();

    }

    /**
     * Simple method witch returns all customers in Database using named JP-QL
     * query. Query is defined in Customer entity
     *
     * @return
     */
    @Override
    public List<Customer> getAllCustomers() {
        return em.createNamedQuery("findAllCustomers").getResultList();
    }
}
