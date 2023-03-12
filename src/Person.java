import java.util.ArrayList;

public class Person {
    private Passport passport;
    private int money;
    private ArrayList<Basket> basket ;

    public Person(Passport passport, int money, ArrayList<Basket> basket) {
        this.passport = passport;
        this.money = money;
        this.basket = basket;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<Basket> getBasket() {
        return basket;
    }

    public void setBasket(ArrayList<Basket> basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return " \npassport: " + passport +
                " \n money: " + money +
                " \n basket: " + basket;
    }
}
