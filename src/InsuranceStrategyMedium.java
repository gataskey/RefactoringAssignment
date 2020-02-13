public class InsuranceStrategyMedium {
    public InsuranceStrategyMedium() {
    }

    double medInsuranceCalc(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    public int getConstant() {
        return 35600;
    }

    public double getWeight() {
        return 0.2;
    }

    public int getAdjustment() {
        return 10000;
    }
}