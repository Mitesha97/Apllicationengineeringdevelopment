/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author lzy_1
 */
public class CustomerDirectory {
    private ArrayList<Customer> cus;

    public CustomerDirectory() {
        cus = new ArrayList<>();
        Customer Customer1 = new Customer("Mansi", "Mansi#123");
        Customer Customer2 = new Customer("Miti", "miti#012");
        Customer Customer3 = new Customer("Ziye", "Zi#007");
        //adding customer
        cus.add(Customer1);
        cus.add(Customer2);
        cus.add(Customer3);

    }

    public ArrayList<Customer> getCustomerDirectory() {
        return this.cus;
    }

    public void setcus(ArrayList<Customer> cus) {
        this.cus = cus;
    }
    // public void addCustomer(Customer c){
    //   cus.add(c);
    //}

    public Customer addCustomer(String userName, String password) {
        Customer c = new Customer(userName, password);
        cus.add(c);
        return c;
    }
}
