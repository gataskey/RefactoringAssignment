public abstract class InsuranceStrategy {
    double highInsuranceCalc(double income) {
        return (income - getAdjusment()) * getWeight() + getConstant();
    }

    public abstract int getConstant();

    public abstract double getWeight();

    public abstract int getAdjusment();
}
