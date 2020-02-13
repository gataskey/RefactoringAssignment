public class InsuranceStrategyHigh {
    public InsuranceStrategyHigh() {
    }

    double highInsuranceCalc(double income) {
        return (income - getAdjusment()) * getWeight() + getConstant();
    }

    public int getConstant() {
        return 76500;
    }

    public double getWeight() {
        return 0.1;
    }

    public int getAdjusment() {
        return 30000;
    }
}