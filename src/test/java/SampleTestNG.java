import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestNG {
   @Test
   public void verifyPrimeNumber() {
       int a = 5;
       boolean input = PrimeNumber.isPrime(a);
       Assert.assertTrue(input, "given input is not primer");
   }
}
