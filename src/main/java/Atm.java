
public class Atm {

    String requiredPin;
    double beginningBalance;

    public Atm(String pin, double bal) {
        requiredPin = pin;
        beginningBalance = bal;
    }

    public boolean allowAccess(String enteredPin) {
        return enteredPin.equals(requiredPin);
    }

    public void deposit(double amount) {
        beginningBalance += amount;
    }

    public void withdraw(double amount) {
        System.out.println(beginningBalance -= amount);
    }

    public double accountBalance() {
        return beginningBalance;
    }
}
