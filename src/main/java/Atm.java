
public class Atm {

    String requiredPin;
    double balance = 73900;

    public Atm(String pin) {
        requiredPin = pin;
    }

    public boolean allowAccess(String enteredPin) {
        return enteredPin.equals(requiredPin);
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
