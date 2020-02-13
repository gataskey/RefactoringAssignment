public class InsuranceCalculator {

    private final InsuranceStrategyVeryHigh insuranceStrategyVeryHigh = new InsuranceStrategyVeryHigh();
    private final InsuranceStrategyHigh insuranceStrategyHigh = new InsuranceStrategyHigh();
    private final InsuranceStrategyMedium insuranceStrategyMedium = new InsuranceStrategyMedium();
    private final InsuranceStrategyLow insuranceStrategyLow = new InsuranceStrategyLow();

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            return insuranceStrategyLow.lowInsuranceCalc(income);
        } else if (income <= 30000) {
            return insuranceStrategyMedium.medInsuranceCalc(income);
        } else if (income <= 60000) {
            return insuranceStrategyHigh.highInsuranceCalc(income);
        } else {
            return insuranceStrategyVeryHigh.veryHighInsuranceCalc(income);
        }
    }



}
