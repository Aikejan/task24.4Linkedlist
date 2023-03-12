import java.time.LocalDate;

public class Product {

    private  String name;
    private  int prise;
    private  int numbers;
    private LocalDate year;

    public Product(String name, int prise, int numbers, LocalDate year) {
        this.name = name;
        this.prise = prise;
        this.numbers = numbers;
        this.year = year;

    }


    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return " \n name; " +  name +
                "\n prise: " +  prise +
                " \n numbers: " +  numbers;
    }
}
