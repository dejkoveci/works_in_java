public class Main {

    public static void main(String[] args) {
	    ProductManager manager = new ProductManager();
        ProductJava product = new ProductJava();
        product.price = 10;
        product.name = "";

        manager.add(product);


    }
}
