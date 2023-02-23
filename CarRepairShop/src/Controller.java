import jdk.swing.interop.SwingInterOpUtils;

public class Controller {

    public static void main(String[] args){
        CustomerDAO customerDAO = new CustomerDAOimpl();
        for(Customer customer : customerDAO.getAllCustomers()){
            System.out.println("Customer : [" + customer.toString());

        }

        //Customer customer = customerDAO.getCustomer(1);
        //System.out.println("Customer : " + customer.toString());
    try {
    Customer customer = customerDAO.getAllCustomers().get(0);
    customer.setBrand("HONDA");
    customerDAO.updateCustomer(customer);
    System.out.println("Customer : " + customerDAO.getCustomer(0));
    System.out.println("Customer : " + customerDAO.getCustomer(1));
    }catch (IndexOutOfBoundsException e){
       System.out.println("Wrong call");
        
    }
        
  }
}
