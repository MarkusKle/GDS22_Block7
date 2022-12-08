package Demo;

import java.util.ArrayList;

public class Customer {
    private int CustomerNumber;
    private ArrayList<Address> addresses = new ArrayList<>();

    public Customer(int customerNumber) {
        this.CustomerNumber = customerNumber;
        //this.addresses = new ArrayList<>();   // Entweder oben oder hier initialisieren
    }

    public void addAddress(Address a) {
        addresses.add(a);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerNumber=" + CustomerNumber +
                ", addresses=" + addresses +
                '}';
    }
}

