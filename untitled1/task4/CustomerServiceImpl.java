package task4;

import java.util.LinkedList;


public  class CustomerServiceImpl implements CustomerService {
   public static final LinkedList<Customer> customerList = new LinkedList<>();

    static {
        customerList.add(new Customer("1", "Lê", "Thiện", "lechithien0901@gmail.com"));
        customerList.add(new Customer("2", "Lê", "Thanh", "Thienlcfs90921@gamil.com"));
        customerList.add(new Customer("3", "Bob", "Smith", "bob.smith@example.com"));

    }

    @Override
    public LinkedList<Customer> getAllCustomer(){
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void upgradeCustomer(Customer customer) {
        for (Customer customer1 : customerList) {
            if (customer1.getId().equals(customer.getId())) {
                customer1.setEmail(customer.getEmail());
                customer1.setFirstName(customer.getFirstName());
                customer1.setLastName(customer.getLastName());
                return;
            }
        }
        throw new IllegalArgumentException("Customer not found.");
    }

    @Override
    public LinkedList<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public void addCustomer() {

    }

    @Override
    public void upgradeCustomer() {

    }
}