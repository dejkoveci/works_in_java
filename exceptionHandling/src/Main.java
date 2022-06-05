public class Main {

    public static void main(String[] args) {
        try{
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[5]);
        }catch (StringIndexOutOfBoundsException exception){
            //System.out.println("Hata oluştu");
            System.out.println(exception);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch (Exception exception){ //bütün hataların base'i Exceptiondır
            System.out.println("Loglandı " +exception);
        }finally {
            System.out.println("Ben her türlü çalışırım");
        }
    }
}
