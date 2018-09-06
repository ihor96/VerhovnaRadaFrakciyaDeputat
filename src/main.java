import java.util.*;

public class main {
    public static void main(String[] args) {
Deputat deputat1 = new Deputat(67,186,"Kovalov","Oleh",34,true,13500);
Deputat deputat2 = new Deputat(86,170,"Ivanov","Ivan",54,false,0);
Deputat deputat3 = new Deputat(96, 179, "Ilonov", "Max", 59, true, 2500);
Deputat deputat4 = new Deputat(93,189,"Cheburek","Vasil",37,true,2200);
Deputat deputat5 = new Deputat(100,200,"Tubolushkin","Petro",64,false,0);
Deputat deputat6 = new Deputat(65, 150, "Dumka", "Andrij", 52, true, 2000);


ArrayList<Deputat>deputats1 = new ArrayList<>();
deputats1.add(deputat1);
deputats1.add(deputat2);
deputats1.add(deputat3);

ArrayList<Deputat>deputats2 = new ArrayList<>();
deputats2.add(deputat4);
deputats2.add(deputat5);
deputats2.add(deputat6);


Frakciya frakciya =new Frakciya(deputats1);
Frakciya frakciya2 = new Frakciya(deputats2);

ArrayList<ArrayList<Deputat>> frakciyas = new ArrayList<>();
frakciyas.add(deputats1);
frakciyas.add(deputats2);
//deputat1.GiveHavar();//Даємо взятку депутату
//frakciya.addDeputattoFrakciya();//Додаємо депутата
// frakciya.DeleteDeputat();//Видаляє депутата
//frakciya.DeleteVsihNegidnukiv();//Видаляє всіх хабарників
//frakciya.MaxHabar();//Макс хабар фракції
//frakciya.AllDeputats();//Вивід всіх депутатів
//frakciya.AllDeputatsRemove();//Видаляє всіх депутатів
//frakciya.SumHabariv();//Сума хабарів фрації
//        System.out.println(frakciya);

        HashMap<String,Frakciya> mapFrakciy = new HashMap<>();
        mapFrakciy.put("Frakciya1",frakciya);
        mapFrakciy.put("Frakciya2",frakciya2);

VerhovnaRada verhovnaRada1 = new VerhovnaRada(mapFrakciy);
//verhovnaRada1.addFrakciyaToVerhovnarada();//Додає фракцію до верховної ради
//verhovnaRada1.DeleteFrakciyafromVerhovnaRada();//Видаляє фракцію
//verhovnaRada1.getAllFrakcions();//Виводить всі фракції Верїовноїради
//verhovnaRada1.getSomeFrakcion();//Виводить певну фракцію по ключу
// verhovnaRada1.addDeputatToFrakcion();//Додає депетата до будь якої фракції
//verhovnaRada1.DeleteDeputatFromFrakciya();//Видалити депутата з фракції
//verhovnaRada1.VsiHavarnukuFrakciyi();//Вивести всіх хабарників фракції
//verhovnaRada1.MaxHabarnukFrakciyi();//Найбільший хабарник фракції
//verhovnaRada1.MaxHabrnukVerhovnoiRadu();//Найбільший хабарник верх ради
//verhovnaRada1.getVsiFrakcii();//Всі фракції верховної ради


        System.out.println("Menu");
        System.out.println("1 - Верховна рада");
        System.out.println("2 - Фракція");
        System.out.println("3 - Депутат");
        System.out.println("Виберіть потрібний пункт");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1 :System.out.println("1-Додати фракцію ");
                System.out.println("2-Видалити фракцію ");
                System.out.println("3-Додати депутата до будь якої фракції ");
                Scanner scanner1 = new Scanner(System.in);
                int i1 = scanner1.nextInt();


                switch (i1){

                    case 1:
                    verhovnaRada1.addFrakciyaToVerhovnarada();
                        System.out.println("Операцію виконано");

                        break;
                    case 2:
                        verhovnaRada1.DeleteFrakciyafromVerhovnaRada();
                        System.out.println("Операцію виконано");
                    break;
                    case 3:
                        verhovnaRada1.addDeputatToFrakcion();
                        System.out.println("Операцію виконано");

                        break;
                }







            case 2 :System.out.println("1-Додати депутата до фракції ");
                System.out.println("2-Видалити всіх хабарників ");
                System.out.println("3-Сума хабарів фракції ");
                Scanner scanner2 = new Scanner(System.in);
                int i2 = scanner2.nextInt();


                switch (i2){

                    case 1:
                        frakciya.addDeputattoFrakciya();
                        System.out.print("Операцію виконано");

                        break;
                    case 2:
                        frakciya.DeleteVsihNegidnukiv();
                        System.out.print("Операцію виконано");
                        break;
                    case 3:
                        frakciya.SumHabariv();
                        System.out.print("Операцію виконано");

                        break;
                }
            case 3 :System.out.println("1-Дати хабар депутату ");
                Scanner scanner3 = new Scanner(System.in);
                int i3 = scanner3.nextInt();


                switch (i3){

                    case 1:
                        System.out.println("Введіть прізвище депутата, якому дати хабар");

                        Scanner scanner4 = new Scanner(System.in);
                        String next = scanner4.next();
                        switch (next){
                            case "Kovalov":
                                deputat1.GiveHavar();
                                break;
                            case "Ivanov":
                                deputat2.GiveHavar();
                                break;
                            case "Ilonov":
                                deputat3.GiveHavar();
                                break;
                            case "Cheburek":
                                deputat4.GiveHavar();
                                break;
                            case "Tubolushkin":
                                deputat5.GiveHavar();
                                break;
                            case "Dumka":
                                deputat6.GiveHavar();
                                break;
                        }
                        System.out.print("Операцію виконано");

                        break;

                }
        }

//        Клас людина:+
//        поля:+
//        вага,зріст+
//        Клас депутат(наслідується від людини):+
//        поля:+
//        прізвище,ім'я,вік,хабарник?,розмі хабаря+
//        методи:+
//        дати хабаря(зробити відповідні перевірки...+
//        якщо депутат не хабарник то щоб він відмовився,+
//        або ж якщо сума хабаря надто велика то щоб він вагався+
//        чи брати чи ні)+
//
//
// Клас фракція+
//        поля:+
//        список депутатів+
//        методи:+
//        додати депутата (вводимо з клави)+
//        видалити депутата(теж з клави)+
//        видалити всіх негідників які брали хабаря+
//        вивести найбільшого хабарника+-
//        вивести всіх депутатів+
//        видалити всіх депутатів+
//        вивести загальну суму хабарів для фракції+
//
// клас Верховна рада
//        поля:+
//        мапа фракцій+
//        методи:+
//        додати\+  видалити фракцію+
//        вивести всі фракції+
//        вивести конкретну фракцію+
//        додати\+ видалити депутата з фракції+
//        вивести всіх хабарників фракції+
//        вивести найбільшого хабарника у фрації+
//        вивести найбільшого хабарника верховної ради+
//        вивести фсіх депутатів фракції+
//
//        в майні зробити через switch меню
//        1 - Верховна рада
//        2 - Фракція
//        3 - Депутат
//        відповідно при вводі з клави певної цифри ми попадаєио в інше меню
//        якщо ми нажали 1 то нам промалюється в консолі таке меню
//        1-додати фракцію
//        2-вивести всі фракції
//        3-вивести найбільшого хабарника
//        меню робимо на свій смак































    }
}
