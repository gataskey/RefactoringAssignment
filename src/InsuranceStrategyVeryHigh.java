public class InsuranceStrategyVeryHigh {

    public InsuranceStrategyVeryHigh() {

    }

    double veryHighInsuranceCalc(double income) {

        return (income - getAdjusment()) * getWeight() + getConstant();
    }

    public int getConstant() {

        return 105600;
    }

    public double getWeight() {

        return 0.02;
    }

    public int getAdjusment() {

        return 60000;
    }
}