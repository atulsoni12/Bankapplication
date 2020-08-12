package Bankapplication;

import java.io.InputStream;
import java.util.Scanner;

public class CustomerMain {
    public static void main(String[] args) {
        System.out.println("please enter Full name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("please enter gender");
        Scanner scanner = new Scanner(System.in);
        String gender = scanner.next();

        System.out.println("please enter customer id");
        Scanner scanner1 = new Scanner(System.in);
        int customerid = scanner1.nextInt();

        System.out.println("New Customer is added Successfully");
    }

}

