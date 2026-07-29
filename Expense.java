package splitwiseapp;

public class Expense {

    private final String payerName;
    private final double amount;

    public Expense(String payerName, double amount) {
        this.payerName = payerName;
        this.amount = amount;
    }

    public Expense(double amount) {
        this("Unknown", amount);
    }

    public String getPayerName() {
        return payerName;
    }

    public double getAmount() {
        return amount;
    }
}
