public class Account {

    public double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

}
