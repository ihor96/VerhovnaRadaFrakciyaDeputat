import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VerhovnaRada {
    Map<String,Frakciya> VerhovnaRada = new HashMap<>();

public Object addFrakciyaToVerhovnarada(){
    System.out.println("Додаємо Фракцію до верховної ради");
    System.out.println("Ключ фракції: ");
    Scanner sc1 = new Scanner(System.in);
    String name = sc1.next();
    Frakciya frakciya = new Frakciya(new ArrayList<Deputat>());
    VerhovnaRada.put(name,frakciya);
    System.out.println(VerhovnaRada);
    return getVerhovnaRada();


}
public void MaxHabrnukVerhovnoiRadu(){
VerhovnaRada.get("Frakciya1").deputats.sort((o1, o2) -> o2.getSizehabar()-o1.getSizehabar());
VerhovnaRada.get("Frakciya2").deputats.sort((o1, o2) -> o2.getSizehabar()-o1.getSizehabar());

ArrayList<Deputat>vsiFrakcii = new ArrayList<>();
    Deputat deputat = VerhovnaRada.get("Frakciya1").getDeputats().get(0);
    Deputat deputat1 = VerhovnaRada.get("Frakciya2").getDeputats().get(0);
    vsiFrakcii.add(deputat);
    vsiFrakcii.add(deputat1);
    vsiFrakcii.sort((o1, o2) -> o2.getSizehabar()-o1.getSizehabar());
    System.out.println(vsiFrakcii.get(0));



    }

    public void getVsiFrakcii(){
        System.out.println("Всі фракції верховної ради ");
        System.out.println(VerhovnaRada);
    }
public void getSomeFrakcion(){
    System.out.println("Яку фракцію вивести? (Key)");
    Scanner sc = new Scanner(System.in);
    String next1 = sc.next();

    System.out.println(getVerhovnaRada().get(next1));
    }

public Object addDeputatToFrakcion(){
    System.out.println("В яку фракцію добавити депутата");
    Scanner scanner = new Scanner(System.in);
    String next = scanner.next();

    System.out.println("Вага депутата ");
    Scanner scanner1 = new Scanner(System.in);
    int weight = scanner1.nextInt();

    System.out.println("Ріст депутата ");
    Scanner scanner2 = new Scanner(System.in);
    int height = scanner2.nextInt();

    System.out.println("Прізвище депутата ");
    Scanner scanner3 = new Scanner(System.in);
    String surname = scanner3.next();

    System.out.println("Імя депутата ");
    Scanner scanner4 = new Scanner(System.in);
    String name = scanner4.nextLine();

    System.out.println("Вік депутата ");
    Scanner scanner5 = new Scanner(System.in);
    int age = scanner5.nextInt();

    System.out.println("Хабарник ? ");
    Scanner scanner6 = new Scanner(System.in);
    boolean HabarnukOrNo = scanner6.nextBoolean();

    System.out.println("Розмір хабаря ");
    Scanner scanner7 = new Scanner(System.in);
    int SizeHabar = scanner7.nextInt();

    VerhovnaRada.get(next).deputats.add(new Deputat(weight,height,surname,name,age,HabarnukOrNo,SizeHabar));
    System.out.println(VerhovnaRada);
    return getVerhovnaRada();
}
public Object DeleteDeputatFromFrakciya(){
    System.out.println("З якої фракцію видалити депутата?");
    Scanner scanner = new Scanner(System.in);
    String next = scanner.next();
    System.out.println("Прізвище кого видалити ");
    Scanner scanner1 = new Scanner(System.in);
    String next1 = scanner1.next();

    Iterator<Deputat> iterator = VerhovnaRada.get(next).deputats.iterator();
    while (iterator.hasNext()){
        if (iterator.next().getSurname().equals(next1)){
            iterator.remove();
        }}
        System.out.println("Депутат "+next1+" покинув фракцію");
    System.out.println(VerhovnaRada);
    return VerhovnaRada;

}
public void MaxHabarnukFrakciyi(){
    System.out.println("З якої фракцію вивести найбільшого хабарника? ");
    Scanner scanner = new Scanner(System.in);
    String next = scanner.next();
    Optional<Deputat> max = VerhovnaRada.get(next).deputats.stream().max((o1, o2) -> o1.getSizehabar() - o2.getSizehabar());
    System.out.println("Найбільший хабарник фракції : ");
    System.out.println(max);


}
public void VsiHavarnukuFrakciyi(){
    System.out.println("З якої фракцію вивести хабарників? ");
    Scanner scanner = new Scanner(System.in);
    String next = scanner.next();
    List<Deputat> collect = VerhovnaRada.get(next).deputats.stream().filter(deputat -> deputat.isHabarnuk()).collect(Collectors.toList());
    System.out.println(collect);

}
public void getAllFrakcions(){
    System.out.println(VerhovnaRada);

}

public Object DeleteFrakciyafromVerhovnaRada(){
    System.out.println("Введіть ключ фракції яку видалити");
    Scanner name = new Scanner(System.in);
    String next = name.next();
    Set<Map.Entry<String, Frakciya>> entries = VerhovnaRada.entrySet();
    Iterator<Map.Entry<String, Frakciya>> iterator = entries.iterator();
    while (iterator.hasNext()){
        if (iterator.next().getKey().equals(next)){
            iterator.remove();
        }

    }

    System.out.println("Фракцію "+next + " видалено !!! ");
    System.out.println(VerhovnaRada);
    return getVerhovnaRada();
}

    @Override
    public String toString() {
        return "VerhovnaRada{" +
                "VerhovnaRada=" + VerhovnaRada +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VerhovnaRada that = (VerhovnaRada) o;
        return Objects.equals(VerhovnaRada, that.VerhovnaRada);
    }

    @Override
    public int hashCode() {

        return Objects.hash(VerhovnaRada);
    }

    public Map<String, Frakciya> getVerhovnaRada() {
        return VerhovnaRada;
    }

    public void setVerhovnaRada(Map<String, Frakciya> verhovnaRada) {
        VerhovnaRada = verhovnaRada;
    }

    public VerhovnaRada(Map<String, Frakciya> verhovnaRada) {
        VerhovnaRada = verhovnaRada;
    }
}