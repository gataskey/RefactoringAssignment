public class InsuranceCalculator {

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            return lowInsuranceCalc(income);
        } else if (income <= 30000) {
            return medInsuranceCalc(income, 10000, 0.2, 35600);
        } else if (income <= 60000) {
            return highInsuranceCalc(income, 30000, 0.1, 76500);
        } else {
            return veryHighInsuranceCalc(income, 60000, 0.02, 105600);
        }
    }

    private double veryHighInsuranceCalc(double income, int i, double v, int i2) {
        return (income - i) * v + i2;
    }

    private double highInsuranceCalc(double income, int i, double v, int i2) {
        return (income - i) * v + i2;
    }

    private double medInsuranceCalc(double income, int i, double v, int i2) {
        return (income - i) * v + i2;
    }

    private double lowInsuranceCalc(double income) {
        return income*0.365;
    }

}
