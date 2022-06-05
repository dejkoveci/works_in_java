import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer furkan = new Customer(1,"Furkan","Çalışkan");
        customers.add(furkan);
        customers.add(new Customer(2,"Yasin Batu","Çalışkan"));
        customers.add(new Customer(3,"Zulfi","Çalışkan"));

        customers.remove(furkan);
        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}
