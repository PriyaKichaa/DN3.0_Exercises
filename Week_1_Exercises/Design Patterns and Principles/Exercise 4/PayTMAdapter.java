public class PayTMAdapter implements PaymentProcessor {
    private PayTM paytm;

    public PayTMAdapter(PayTM paytm) {
        this.paytm = paytm;
    }

    @Override
    public void processPayment(double amount) {
        paytm.makePayment(amount);
    }
}