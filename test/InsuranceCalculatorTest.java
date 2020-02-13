import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InsuranceCalculatorTest {

    @Test
    public void lowInsurance(){
        InsuranceCalculator insuranceCalculator = new InsuranceCalculator();
        double insurance = insuranceCalculator.calculateInsurance(5000);
        assertEquals(5000*0.365,insurance);
    }

    @Test
    public void medInsurance(){
        InsuranceCalculator insuranceCalculator = new InsuranceCalculator();
        double insurance = insuranceCalculator.calculateInsurance(22000);
        assertEquals((22000-10000)*0.2+35600,insurance);
    }

    @Test
    public void highInsurance(){
        InsuranceCalculator insuranceCalculator = new InsuranceCalculator();
        double insurance = insuranceCalculator.calculateInsurance(52750);
        assertEquals((52750-30000)*0.1+76500,insurance);
    }

    @Test
    public void veryHighInsurance(){
        InsuranceCalculator insuranceCalculator = new InsuranceCalculator();
        double insurance = insuranceCalculator.calculateInsurance(75000);
        assertEquals((75000-60000)*0.02+105600,insurance);

    }



}