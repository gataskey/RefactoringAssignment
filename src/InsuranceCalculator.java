public class InsuranceCalculator {

    private InsuranceStrategyVeryHigh strategyVH;
    private InsuranceStrategyHigh strategyH;
    private InsuranceStrategyMedium strategyM;
    private InsuranceStrategyLow strategyL;

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            strategyL = new InsuranceStrategyLow();
            return strategyL.lowInsuranceCalc(income);
        } else if (income <= 30000) {
            strategyM = new InsuranceStrategyMedium();
            return strategyM.medInsuranceCalc(income);
        } else if (income <= 60000) {
            strategyH = new InsuranceStrategyHigh();
            return strategyH.highInsuranceCalc(income);
        } else {
            strategyVH = new InsuranceStrategyVeryHigh();
            return strategyVH.veryHighInsuranceCalc(income);
        }
    }



}
