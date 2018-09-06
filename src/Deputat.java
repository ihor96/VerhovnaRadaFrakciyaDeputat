import java.util.Objects;
import java.util.Scanner;

public class Deputat extends Human {
    private String surname;
    private String name;
    private int age;
    private boolean habarnuk;
    private int sizehabar;

    public void GiveHavar() {
       if(this.habarnuk==false){
           System.out.println("Не візьму");
       }else {
           System.out.println("Скільки пропонуєш?");
           Scanner scanner1 = new Scanner(System.in);
           int vzyatka = scanner1.nextInt();
           if (vzyatka>=this.sizehabar){
           System.out.println("Беру");}
           else {
               System.out.println("Мало");
           }
       }}

    @Override
    public String toString() {
        return "Deputat{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", habarnuk=" + habarnuk +
                ", sizehabar=" + sizehabar +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Deputat deputat = (Deputat) o;
        return age == deputat.age &&
                habarnuk == deputat.habarnuk &&
                sizehabar == deputat.sizehabar &&
                Objects.equals(surname, deputat.surname) &&
                Objects.equals(name, deputat.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), surname, name, age, habarnuk, sizehabar);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHabarnuk() {
        return habarnuk;
    }

    public void setHabarnuk(boolean habarnuk) {
        this.habarnuk = habarnuk;
    }

    public int getSizehabar() {
        return sizehabar;
    }

    public void setSizehabar(int sizehabar) {
        this.sizehabar = sizehabar;
    }

    public Deputat(int weight, double height, String surname, String name, int age, boolean habarnuk, int sizehabar) {
        super(weight, height);
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.habarnuk = habarnuk;
        this.sizehabar = sizehabar;
    }
}