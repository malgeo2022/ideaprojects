import java.util.ArrayList;
import java.util.List;

public class CustomerDAOimpl implements CustomerDAO {

    List<Customer> customers;

    public CustomerDAOimpl(){
        customers = new ArrayList<Customer>();
        Customer customer1 = new Customer("john","lathan",1,"BMW","318is");
        Customer customer2 = new Customer("george","malelis",2,"BMW","320is");
        customers.add(customer1);
        customers.add(customer2);
    }

    @Override
    public void deleteCustomer(Customer customer){
        customers.remove(customer.getId());
        System.out.println("Customer : id No " + customer.getId() + ", deleted from database");
    }

    @Override
    public List<Customer> getAllCustomers(){
        return customers;
    }

    @Override
    public Customer getCustomer(int id) {
        return customers.get(id);
    }

    @Override
    public void updateCustomer(Customer customer){
        customers.get(customer.getId()).setFirstName(customer.getFirstName());
        System.out.println("Customer : Roll No " + customer.getId() + ", updated in the database");
    }
}
