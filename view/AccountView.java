package view;

import controller.AccountController;

import java.util.Scanner;

public class AccountView {
    public static void main(Scanner sc) {
        AccountController accountController = new AccountController();
        while(true){
            switch (sc.next()){
                case "0":
                    System.out.println("종료");return;
                case "1":
                    System.out.println(accountController.createAccount(sc));
                    break;
                case "2":
                    System.out.println(accountController.deposit(sc));
                    break;
                case "3":
                    System.out.println(accountController.withdraw(sc));
                    break;
                case "4":
                    System.out.println(accountController.getBalance(sc));
                    break;
                case "5":
                    System.out.println(accountController.cancelAccount(sc));
                    break;
                case "6":
                    System.out.println(accountController.getAccounts(sc));
                    break;
            }

        }

    }
}
