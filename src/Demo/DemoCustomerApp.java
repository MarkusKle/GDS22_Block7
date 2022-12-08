package Demo;

import java.util.Arrays;

public class DemoCustomerApp {
    public static void main(String[] args) {
        Customer c = new Customer(1);
        c.addAddress(new Address("KÖrblergasse", "8020", "Graz", "AUT"));

        System.out.println(c.toString());

    }
}
