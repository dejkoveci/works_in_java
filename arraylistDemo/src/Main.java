import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList(); //bütün tiplerde eleman alır(Object).
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        //System.out.println(sayilar.size());
        //sayilar.set(2,100);
        //sayilar.remove(2); //seçilen indexi siler
        //sayilar.clear(); //tüm elemanları siler
        //System.out.println(sayilar.get(2));

        for (Object i:sayilar){
            System.out.println(i);
        }
    }
}
