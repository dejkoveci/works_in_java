public class ProductManager {
    public void add(ProductJava product){
        if (ProductValidator.isValid(product)){
        System.out.println("Eklendi");

        }else{
            System.out.println("Ürün bilgileri eklenemedi");
        }
    }
}
