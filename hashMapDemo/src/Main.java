import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("book","kitap");
        sozluk.put("computer","bilgisayar");
        sozluk.put("table","masa");
        System.out.println(sozluk.size());

        for (String item: sozluk.keySet()){
            //System.out.println(item);
            System.out.println("Eleman-"+item+" Değer-"+sozluk.get(item));
        }

        sozluk.remove("table");
        sozluk.clear();
        System.out.println(sozluk.get("table"));

        
    }
}
