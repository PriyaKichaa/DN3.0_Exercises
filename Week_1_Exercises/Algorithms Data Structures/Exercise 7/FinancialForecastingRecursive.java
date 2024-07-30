public class FinancialForecastingRecursive {

    public static double calculateFutureValue(double principal, double growthRate, int periods) {
        if (periods == 0) {
            return principal;
        }
        return calculateFutureValue(principal * (1 + growthRate), growthRate, periods - 1);
    }
}
