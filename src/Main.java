import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers=new ArrayList<Customer>();

        Customer metin=new Customer(1,"metin","baran");
        customers.add(metin);

        customers.add(new Customer(2,"murat","baran"));
        customers.add(new Customer(3,"selim","baran"));


        //Burada remove desek bile silme islemini yapmaz
        customers.remove(new Customer(1,"murat","baran"));

        customers.remove(metin);
        for(Customer customer:customers){
            System.out.println(customer.firsName);
        }



    }
}
