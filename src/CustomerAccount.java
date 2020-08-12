import Bankapplication.CustomerMain;

import java.io.InputStream;

public class CustomerAccount extends CustomerMain {
    private double balance;
    //set balance to zero
    public CustomerAccount(){
        balance = 0.0;
    }

    //deposit
    public void deposit(double amount){
        balance = balance + amount;

    }

    //withdrawal
    public void withdrawal(double amount){
        balance= balance - amount;
    }


    //Getbalance

    public double getBalance() {
        return balance;
    }

    public void Inputstream(InputStream in) {
    }

}
