public class Main {

    public static void main(String[] args) {
	    Product product = new Product(1,"Laptop","Apple Laptop",5000,2,"Siyah");

        /*product.setName("Laptop");
        product.setId(1);
        product.setDescription("Apple Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);*/

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getName());
        System.out.println(product.getId());
        System.out.println(product.getPrice());
        System.out.println(product.getDescription());
        System.out.println(product.getStockAmount());
        System.out.println(product.getKod());
    }
}
