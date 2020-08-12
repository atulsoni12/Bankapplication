public class Customertran extends CustomerAccount {
    public static void main(String[] args) {

        //create cust1
        CustomerAccount cust1 = new CustomerAccount();
        cust1.deposit(500);

        //create cust2
        CustomerAccount cust2 = new CustomerAccount();
        cust2.deposit(100);

        //get balance
        System.out.println(cust1.getBalance());
        System.out.println(cust2.getBalance());
    }


}
