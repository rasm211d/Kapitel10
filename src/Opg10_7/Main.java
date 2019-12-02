package Opg10_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] accounts = new Account[10];
        initialBalance(accounts);

        do {
            System.out.println("Enter an id: ");
            int id = input.nextInt();

            if(isValidId(id, accounts)) {
                int choice;
                do {
                    choice = displayMenu(input);
                    if (isTransaction(choice)) {
                        executeTransaction(choice, accounts, id, input);
                    }
                } while (choice != 4);
            }
        } while (true);



    }
    public static void initialBalance(Account[] a) {
        int initialballance = 100;
        for (int i = 0; i < a.length; i++) {
            a[i] = new Account(i, initialballance);
        }
    }

    public static boolean isTransaction(int choice) {
        return choice > 0 && choice < 4;
    }

    public static boolean isValidId (int id, Account[] a) {
        for(int i = 0; i < a.length; i++) {
            if (id == a[i].getId()) {
                return true;
            }
        }
        return false;
    }
    public static int displayMenu(Scanner input) {
        System.out.println("\nMain Menu \n1: check balance\n2: withdraw\n3: deposit\n4: exit\nenter a choice");
        return input.nextInt();
    }

    public static void executeTransaction(int c, Account[] a, int id, Scanner input) {
        switch (c) {
            case 1:
                System.out.println("The balance is: " + a[id].getBalance());
                break;
            case 2:
                System.out.print("Enter an amout to withdraw: ");
                a[id].withdraw(input.nextDouble());
                System.out.println("New balance is: " + a[id].getBalance());
                break;
            case 3:
                System.out.print("Enter an amount to diposit: ");
                a[id].deposit(input.nextDouble());
                System.out.println("New balance is: " + a[id].getBalance());
                break;
        }
    }


}
