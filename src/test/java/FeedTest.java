import org.junit.Assert;
import org.junit.Test;

public class FeedTest {
    @Test
    public void feedPopulationReturnDeathsTest(){
        int population = 100;
        int amountToFeed = 2000;
        int bushelsToSurvive = 20;

        int expected = 0;
        int actual = FeedingPopulation.feedPopulationReturnDeaths(population, amountToFeed, bushelsToSurvive);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void feedPopulationReturnDeathsTest2(){
        int population = 100;
        int amountToFeed = 1800;
        int bushelsToSurvive = 20;

        int expected = 10;
        int actual = FeedingPopulation.feedPopulationReturnDeaths(population, amountToFeed, bushelsToSurvive);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void feedPopulationReturnDeathsTest3(){
        int population = 50;
        int amountToFeed = 600;
        int bushelsToSurvive = 20;

        int expected = 20;
        int actual = FeedingPopulation.feedPopulationReturnDeaths(population, amountToFeed, bushelsToSurvive);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void feedPopulationReturnDeathsTest4(){
        int population = 110;
        int amountToFeed = 2000;
        int bushelsToSurvive = 20;

        int expected = 10;
        int actual = FeedingPopulation.feedPopulationReturnDeaths(population, amountToFeed, bushelsToSurvive);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void updatePopulationTest(){
        int population = 100;
        int diedFromStarvation = 0;

        int expected = 100;
        int actual = FeedingPopulation.updatePopulation(population, diedFromStarvation);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void updatePopulationTest2(){
        int population = 113;
        int diedFromStarvation = 49;

        int expected = 64;
        int actual = FeedingPopulation.updatePopulation(population, diedFromStarvation);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void updatePopulationTest3(){
        int population = 50;
        int diedFromStarvation = 50;

        int expected = 0;
        int actual = FeedingPopulation.updatePopulation(population, diedFromStarvation);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void updateBushelsTest(){
        int bushelsOwned = 3000;
        int amountToFeed = 2000;

        int expected = 1000;
        int actual = FeedingPopulation.updateBushels(bushelsOwned, amountToFeed);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void updateBushelsTest2(){
        int bushelsOwned = 4500;
        int amountToFeed = 1500;

        int expected = 3000;
        int actual = FeedingPopulation.updateBushels(bushelsOwned, amountToFeed);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void updateBushelsTest3(){
        int bushelsOwned = 1450;
        int amountToFeed = 0;

        int expected = 1450;
        int actual = FeedingPopulation.updateBushels(bushelsOwned, amountToFeed);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void uprisingTest(){
        int population = 100;
        int howManyPeopleStarved = 20;

        boolean expected = false;
        boolean actual = FeedingPopulation.uprising(population, howManyPeopleStarved);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void uprisingTest2(){
        int population = 80;
        int howManyPeopleStarved = 12;

        boolean expected = false;
        boolean actual = FeedingPopulation.uprising(population, howManyPeopleStarved);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void uprisingTest3(){
        int population = 110;
        int howManyPeopleStarved = 70;

        boolean expected = true;
        boolean actual = FeedingPopulation.uprising(population, howManyPeopleStarved);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void uprisingTest4(){
        int population = 55;
        int howManyPeopleStarved = 30;

        boolean expected = true;
        boolean actual = FeedingPopulation.uprising(population, howManyPeopleStarved);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void immigrantsTest(){
        int population = 100;
        int acresOwned = 1000;
        int bushelsOwned = 3000;

        int expected = 3;
        int actual = FeedingPopulation.immigrants(population, acresOwned, bushelsOwned);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void immigrantsTest2(){
        int population = 80;
        int acresOwned = 1200;
        int bushelsOwned = 4500;

        int expected = 4;
        int actual = FeedingPopulation.immigrants(population, acresOwned, bushelsOwned);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void immigrantsTest3(){
        int population = 116;
        int acresOwned = 1100;
        int bushelsOwned = 6750;

        int expected = 3;
        int actual = FeedingPopulation.immigrants(population, acresOwned, bushelsOwned);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addImmigrantsTest(){
        int population = 100;
        int immigrants = 4;

        int expected = 104;
        int actual = FeedingPopulation.addImmigrants(population, immigrants);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addImmigrantsTest2(){
        int population = 98;
        int immigrants = 7;

        int expected = 105;
        int actual = FeedingPopulation.addImmigrants(population, immigrants);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addImmigrantsTest3(){
        int population = 67;
        int immigrants = 3;

        int expected = 70;
        int actual = FeedingPopulation.addImmigrants(population, immigrants);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addImmigrantsTest4(){
        int population = 50;
        int immigrants = 0;

        int expected = 50;
        int actual = FeedingPopulation.addImmigrants(population, immigrants);
        Assert.assertEquals(expected, actual);

    }


}