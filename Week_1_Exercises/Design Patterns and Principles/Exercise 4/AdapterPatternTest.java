public class AdapterPatternTest {
    public static void main(String[] args) {
        
        PayPal payPal = new PayPal();
        GPay gpay = new GPay();
        PayTM paytm = new PayTM();

        PaymentProcessor payPalProcessor = new PayPalAdapter(payPal);
        payPalProcessor.processPayment(100.0);

        PaymentProcessor gpayProcessor = new gpayAdapter(gpay);
        gpayProcessor.processPayment(200.0);

        PaymentProcessor paytmProcessor = new paytmAdapter(paytm);
        paytmProcessor.processPayment(300.0);
    }
}
