public class InsuranceStrategyLow {
    public InsuranceStrategyLow() {
    }

    double lowInsuranceCalc(double income) {
        return income * getWeight();
    }

    public double getWeight() {
        return 0.365;
    }
}