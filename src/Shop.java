import java.util.ArrayList;

public class  Shop  {
    private String name;
    private  String addres;

    public Shop(String name, String addres) {
        this.name = name;
        this.addres = addres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public String toString() {
        return " \nname: " + name +
                "\n  addres: " + addres;
    }


}
