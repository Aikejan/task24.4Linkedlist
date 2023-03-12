import java.util.ArrayList;

public class MethodImplementation implements  Array {
    @Override
    public String producktName(ArrayList<Person> personArrayList) {
        for (Person a : personArrayList) {
            if (18 < a.getPassport().getAge() || 50 > a.getPassport().getAge()) {
                System.out.println("Alkogol mojno prodavat" + a);
            } else {
                System.out.println("Alkogol nelzya prodavat");
            }
        }
        return " ";

    }

    @Override
    public int producktPrise(ArrayList<Product> productsArrayList) {
        for (Product b : productsArrayList) {
            System.out.println(b.getPrise() +b.getName());
        }
        return 0;
    }
}
