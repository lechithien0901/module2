package task4;

import java.util.LinkedList;

public interface CustomerService {
    LinkedList<?> getAllCustomer();
    void addCustomer();
    void upgradeCustomer();


    LinkedList<?> getAllCustomers();

    void addCustomer(Customer customer);

    void upgradeCustomer(Customer customer);
}
