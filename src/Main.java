import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        Shop lara = new Shop("Raindow","Sovetskaya 80");
        System.out.println(lara.toString());



        Product jyse = new Product("Alkogol",2000,2,LocalDate.of(1980,3,5));
        Product fruist = new Product("Orange",200,5,LocalDate.of(2023,1,4));
        Product water = new Product("Coco- Cola",150,3,LocalDate.of(2022,7,8));

        Product drink = new Product("Fanta",120,3,LocalDate.of(2022,9,8));
        Product vegetablies = new Product("Tomato",150,3,LocalDate.of(2023,2,8));
        Product chocalat = new Product("AlpenGold",100,3,LocalDate.of(2022,8,2));
        ArrayList<Product> rava = new ArrayList<>(Arrays.asList(jyse, fruist, water, drink, vegetablies, chocalat));


        Basket  basket = new Basket(new ArrayList<Product>(Arrays.asList(jyse,fruist,water)));
        Basket basket2 = new Basket(new ArrayList<Product>(Arrays.asList(drink, vegetablies, chocalat)));



        Person person = new Person(new Passport("Aizat","Daniyarova",LocalDate.of(2009,6,7),Gender.FEMALE), 5000, new ArrayList<Basket>(Arrays.asList(basket)));
        Person person1 = new Person(new Passport("Alina","Akhmatova", LocalDate.of(1977,2,7), Gender.FEMALE),3500,new ArrayList<Basket>(Arrays.asList(basket2)));




        ArrayList<Person> arrayPerson = new ArrayList<>(Arrays.asList(person, person1));
        Passport b = new Passport();

        MethodImplementation sara = new MethodImplementation();
        sara.producktName(arrayPerson);
        sara.producktPrise(rava);


      }
    }

