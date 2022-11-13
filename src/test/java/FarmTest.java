import com.sun.tools.javac.Main;
import org.junit.Assert;
import org.junit.Test;

public class FarmTest {

    @Test
    public void updateBushelsTest(){
        int bushelsOwned = 4000;
        int amountToPlant = 900;
        int expected = 3100;

        int actual = MaintainCrops.updateBushels(bushelsOwned, amountToPlant);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void harvestPerAcreTest(){
        int actual = MaintainCrops.harvestRate();
        System.out.println("EACH ACRE PRODUCED " + actual + " BUSHEL(S)");
        Assert.assertTrue(actual >= 1 && actual <= 6);
    }

    @Test
    public void getHarvestTest(){
        int amountToPlant = 900;
        int harvestRate = 4;
        int expected = 3600;

        int actual = MaintainCrops.getHarvest(amountToPlant, harvestRate);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addHarvestTest(){
        int bushelsOwned = 2500;
        int harvested = 3600;
        int expected = 6100;

        int actual = MaintainCrops.addHarvest(bushelsOwned, harvested);
        Assert.assertEquals(expected, actual);
    }
}