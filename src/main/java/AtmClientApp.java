
import java.util.Scanner;

public class AtmClientApp {
    public static void main(String[] args) {
        Atm client = new Atm("7399", 73900.00);

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your 4-digit pin number: ");
        String usersPin = input.next();

        if (client.allowAccess(usersPin)) {
            System.out.println("True");

            int menuSelection = 0;
            while(menuSelection != 1 && menuSelection != 2 && menuSelection != 3 && menuSelection != 4) {
                System.out.print("Menu: \nPress 1 to deposit funds \nPress 2 to withdraw funds \nPress 3 to check account balance \nPress 4 to exit \n");
                Scanner menu = new Scanner(System.in);
                menuSelection = menu.nextInt();

                if (menuSelection == 1) {
                    Scanner deposit = new Scanner(System.in);
                    System.out.print("Please enter deposit amount: ");
                    double depositAmount = deposit.nextDouble();
                    client.deposit(depositAmount);
                    System.out.println("Current Account Balance: " + client.beginningBalance);
                } else if (menuSelection == 2) {
                    Scanner withdrawl = new Scanner(System.in);
                    System.out.print("Enter the amount that you want to withdraw: ");
                    double withdrawlAmount = withdrawl.nextDouble();
                    client.withdraw(withdrawlAmount);
                    System.out.println("Current Account Balance: " + client.beginningBalance);
                } else if (menuSelection == 3) {
                    System.out.println(client.accountBalance());
                } else if (menuSelection == 4) {
                    System.out.println("Have a great day! ");
                    break;
                }
            }

        } else {
            System.out.println("False");
        }
    }
}
