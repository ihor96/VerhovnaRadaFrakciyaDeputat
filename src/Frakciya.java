import javax.naming.NamingEnumeration;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Frakciya {
     ArrayList<Deputat>deputats = new ArrayList<>();

public void AllDeputats(){
    System.out.println(deputats);
}
public void SumHabariv(){
    int sum = 0;
    Iterator<Deputat> iterator = deputats.iterator();
  while(iterator.hasNext()) {
      int sizehabar = iterator.next().getSizehabar();
      sum=sum+sizehabar;
  }
    System.out.println("Cума хабарів фракції: ");
    System.out.print(sum);
}

public Object AllDeputatsRemove(){
    return deputats.removeAll(deputats);
}

     public void   MaxHabar() {
         ArrayList<Integer> max = new ArrayList<>();
         Iterator<Deputat> iterator = deputats.iterator();
         while (iterator.hasNext()) {
             max.add(iterator.next().getSizehabar());
         }
         List<Integer> collect = max.stream().distinct().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
         int maxx = collect.get(0);
         System.out.println("Максимальний хабар в фракції: "+ maxx);
         }
    @Override
    public String toString() {
        return "Frakciya{" +
                "deputats=" + deputats +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frakciya frakciya = (Frakciya) o;
        return Objects.equals(deputats, frakciya.deputats);
    }

    @Override
    public int hashCode() {

        return Objects.hash(deputats);
    }

    public ArrayList<Deputat> getDeputats() {
        return deputats;
    }

    public void setDeputats(ArrayList<Deputat> deputats) {
        this.deputats = deputats;
    }

    public Frakciya(ArrayList<Deputat> deputats) {
        this.deputats = deputats;
    }
    public Object DeleteDeputat(){
        System.out.println("Ім*я депутата якого видалити");
        Scanner delete = new Scanner(System.in);
        String delete1 = delete.nextLine();
        Iterator<Deputat> iterator = deputats.iterator();
        while (iterator.hasNext()){

        if(iterator.next().getName().equals(delete1)){
            iterator.remove();}


        }return deputats;
    }
    public Object addDeputattoFrakciya(){
        System.out.println(" ");
        System.out.println("Додаємо депутата");

        System.out.println("Вага");
        Scanner weight = new Scanner(System.in);
        int weight1 = weight.nextInt();

        System.out.println("Ріст");
        Scanner height = new Scanner(System.in);
        int height1 = weight.nextInt();
        System.out.println("Прізвище");
        Scanner surname = new Scanner(System.in);
        String surname1 = surname.nextLine();
        System.out.println("Ім*я");
        Scanner name = new Scanner(System.in);
        String name1 = surname.nextLine();
        System.out.println("Вік");
        Scanner age = new Scanner(System.in);
        int age1 = weight.nextInt();
        System.out.println("Хабарник чи ні");
        Scanner HabarnukOrNo =new Scanner(System.in);
        boolean HabarnukOrNo1 = HabarnukOrNo.nextBoolean();
        System.out.println("Розмір хараря");
        Scanner SizeHabar = new Scanner(System.in);
        int SizeHabar1 = weight.nextInt();



        Deputat deputat  = new Deputat(weight1,height1,surname1,name1,age1,HabarnukOrNo1,SizeHabar1);
    return  deputats.add(deputat);
    }
    public Object DeleteVsihNegidnukiv(){
        Iterator<Deputat> iterator = deputats.iterator();
        while (iterator.hasNext()){
        if(iterator.next().isHabarnuk()){
            iterator.remove();
        }}
        System.out.println(deputats);
return deputats;}}

