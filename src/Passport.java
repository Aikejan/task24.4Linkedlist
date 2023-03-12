import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Passport implements Comparable <Passport> {
    private String firsName;
    private String lastName;
    private LocalDate year;
    private Gender gender;
    private int age;

    public  Passport(){

    }
    public Passport(String firsName, String lastName, LocalDate year, Gender gender) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.year = year;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return " \n firsName: " + firsName +
                " \n lastName: " + lastName +
                " \n year: " + year +
                "\n gender: " + gender + "age: " + age;
    }

    public  static  Comparator<Passport>sortAge = new Comparator<Passport>() {
        @Override
        public int compare(Passport o1, Passport o2) {
            return o1.getAge()-o2.getAge();
        }


    };

    @Override
    public int compareTo(Passport o) {
        return 0;
    }

}



