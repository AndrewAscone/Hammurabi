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
    public void updateBushelsTest2(){
        int bushelsOwned = 2500;
        int amountToPlant = 0;
        int expected = 2500;

        int actual = MaintainCrops.updateBushels(bushelsOwned, amountToPlant);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void updateBushelsTest3(){
        int bushelsOwned = 5000;
        int amountToPlant = 5000;
        int expected = 0;

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
    public void harvestPerAcreTest2(){
        int actual = MaintainCrops.harvestRate();
        System.out.println("EACH ACRE PRODUCED " + actual + " BUSHEL(S)");
        Assert.assertTrue(actual >= 1 && actual <= 6);
    }

    @Test
    public void harvestPerAcreTest3(){
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
    public void getHarvestTest2(){
        int amountToPlant = 2000;
        int harvestRate = 5;
        int expected = 10000;

        int actual = MaintainCrops.getHarvest(amountToPlant, harvestRate);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHarvestTest3(){
        int amountToPlant = 510;
        int harvestRate = 2;
        int expected = 1020;

        int actual = MaintainCrops.getHarvest(amountToPlant, harvestRate);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHarvestTest4(){
        int amountToPlant = 1000;
        int harvestRate = 1;
        int expected = 1000;

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

    @Test
    public void addHarvestTest2(){
        int bushelsOwned = 4500;
        int harvested = 1250;
        int expected = 5750;

        int actual = MaintainCrops.addHarvest(bushelsOwned, harvested);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addHarvestTest3(){
        int bushelsOwned = 1000;
        int harvested = 0;
        int expected = 1000;

        int actual = MaintainCrops.addHarvest(bushelsOwned, harvested);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addHarvestTest4(){
        int bushelsOwned = 2000;
        int harvested = 897;
        int expected = 2897;

        int actual = MaintainCrops.addHarvest(bushelsOwned, harvested);
        Assert.assertEquals(expected, actual);
    }
}