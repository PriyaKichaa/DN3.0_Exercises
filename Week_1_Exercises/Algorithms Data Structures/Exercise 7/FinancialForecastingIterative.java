public class FinancialForecastingIterative {

    public static double calculateFutureValue(double principal, double growthRate, int periods) {
        double futureValue = principal;
        for (int i = 0; i < periods; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }
}
