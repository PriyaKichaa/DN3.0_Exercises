public class GPayAdapter implements PaymentProcessor {
    private GPay gpay;

    public GPayAdapter(Square square) {
        this.gpay = gpay;
    }

    @Override
    public void processPayment(double amount) {
        gpay.initiatePayment(amount);
    }
}