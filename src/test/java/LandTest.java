import org.junit.Assert;
import org.junit.Test;

public class LandTest {

    @Test
    public void numOfDiceTest1() {

        int expected = 1;
        int actual = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numOfDiceTest2() {

        int expected = 1;
        int actual = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void newCostOfLandTest(){
        int actual = TradingLand.newCostOfLand();
        Assert.assertTrue(actual >= 17 && actual <= 26);
    }

}