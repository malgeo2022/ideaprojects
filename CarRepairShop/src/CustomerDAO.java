import java.util.List;

public interface CustomerDAO {
    public List<Customer> getAllCustomers();
    public Customer getCustomer(int id);
    public void updateCustomer(Customer customer);
    public void deleteCustomer(Customer customer);
}
