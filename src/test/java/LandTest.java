import org.junit.Assert;
import org.junit.Test;

public class LandTest {

    @Test
    public void tradeAcresTest_pos1() {
        int expected = TradingLand.tradeAcres(1,4);
        int actual = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tradeAcresTest_pos2() {
        int expected = TradingLand.tradeAcres(2354,37);
        int actual = 2391;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tradeAcresTest_neg1() {
        int expected = TradingLand.tradeAcres(346,-53);
        int actual = 293;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tradeAcresTest_neg2() {
        int expected = TradingLand.tradeAcres(93,-7);
        int actual = 86;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tradeAcresTest_zero1() {
        int expected = TradingLand.tradeAcres(0,35);
        int actual = 35;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tradeAcresTest_zero2() {
        int expected = TradingLand.tradeAcres(6,0);
        int actual = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void updateBushelsTest_pos1() {
        int expected = TradingLand.updateBushels(300, 5, 30);
        int actual = 150;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void updateBushelsTest_pos2() {
        int expected = TradingLand.updateBushels(1000, 21, 18);
        int actual = 622;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void updateBushelsTest_neg1() {
        int expected = TradingLand.updateBushels(100, -7, 9);
        int actual = 163;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void updateBushelsTest_neg2() {
        int expected = TradingLand.updateBushels(4567, -11, 23);
        int actual = 4820;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void updateBushelsTest_zero1() {
        int expected = TradingLand.updateBushels(100, 0, 30);
        int actual = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void updateBushelsTest_zero2() {
        int expected = TradingLand.updateBushels(100, 5, 0);
        int actual = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void newCostOfLandTest_rngWithinRange(){
        int actual = TradingLand.newCostOfLand();
        System.out.println("NEW LAND TRADING PRICE IS " + actual);
        Assert.assertTrue(actual >= 17 && actual <= 26);
    }

    @Test
    public void newCostOfLandTest_rngWithinRange2(){
        int actual = TradingLand.newCostOfLand();
        System.out.println("NEW LAND TRADING PRICE IS " + actual);
        Assert.assertTrue(actual >= 17 && actual <= 26);
    }

    @Test
    public void newCostOfLandTest_rngWithinRang3(){
        int actual = TradingLand.newCostOfLand();
        System.out.println("NEW LAND TRADING PRICE IS " + actual);
        Assert.assertTrue(actual >= 17 && actual <= 26);
    }

}