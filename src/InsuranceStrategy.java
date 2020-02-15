public abstract class InsuranceStrategy {

    double veryHighInsuranceCalc(double income) {

        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    double highInsuranceCalc(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    double medInsuranceCalc(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    double lowInsuranceCalc(double income) {
        return income * getWeight();
    }

    public abstract int getConstant();

    public abstract double getWeight();

    public abstract int getAdjustment();
}
