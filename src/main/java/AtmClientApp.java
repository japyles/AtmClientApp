import java.util.Scanner;

public class AtmClientApp {
    public static void main(String[] args) {
        Atm client = new Atm("5656");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your 4-digit pin number: ");
        String usersPin = input.next();

        if (client.allowAccess(usersPin)) {
            System.out.println("True");

            int menuSelection = 0;
            while(menuSelection != 1) {
                System.out.print("Menu: Press 1 to deposit funds ");
                Scanner menu = new Scanner(System.in);
                menuSelection = menu.nextInt();

                if (menuSelection == 1) {
                    Scanner deposit = new Scanner(System.in);
                    System.out.print("Please enter deposit amount: ");
                    double depositAmount = deposit.nextInt();
                    client.deposit(depositAmount);
                    System.out.println("Current Account Balance: " + client.balance);
                }
            }

        } else {
            System.out.println("False");
        }
    }
}
