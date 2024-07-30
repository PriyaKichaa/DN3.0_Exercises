public class MainIterative {
    public static void main(String[] args) {
        double principal = 1000.0; 
        double growthRate = 0.05;  
        int periods = 10;
        
        double futureValue = FinancialForecastingIterative.calculateFutureValue(principal, growthRate, periods);
        System.out.printf("The future value of the investment (iterative) is: %.2f%n", futureValue);
    }
}
