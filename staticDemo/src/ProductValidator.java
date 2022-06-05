public class ProductValidator {
    static {
        System.out.println("Static yapıcı blok çalıştı");
    }
    public static boolean isValid(ProductJava product){
        if(product.price> 0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }


}
