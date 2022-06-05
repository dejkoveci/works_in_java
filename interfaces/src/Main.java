public class Main {
//interface ve abstract classlar new'lenmez!!
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}
