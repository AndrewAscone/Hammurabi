import org.junit.Assert;
import org.junit.Test;

public class DisasterTest {
// works when random value set to 100
//    @Test
//    public void plagueDeaths() {
//        int population = 100;
//        int expected = 50;
//        int actual = UnnaturalDisasters.plagueDeaths(population);
//        Assert.assertEquals(actual, expected);
//    }

    @Test
    public void updatePopulation() {

        int population = 100;
        int expected = 50;
        int plagueDeaths = population/2;
        int actual = UnnaturalDisasters.updatePopulation(population, plagueDeaths);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void updatePopulation2() {
        int population = 100;
        int expected = 100;
        int plagueDeaths = 0;
        int actual = UnnaturalDisasters.updatePopulation(population, plagueDeaths);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void updateBushels() {
        int bushelsOwned = 2000;
        int expected = 1800;
        int bushelsEatenByRats = 200;
        int actual = UnnaturalDisasters.updateBushels(bushelsOwned, bushelsEatenByRats);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void updateBushels2() {
        int bushelsOwned = 2000;
        int expected = 1000;
        int bushelsEatenByRats = 1000;
        int actual = UnnaturalDisasters.updateBushels(bushelsOwned, bushelsEatenByRats);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void updateBushels3() {
        int bushelsOwned = 2000;
        int expected = 2000;
        int bushelsEatenByRats = 0;
        int actual = UnnaturalDisasters.updateBushels(bushelsOwned, bushelsEatenByRats);
        Assert.assertEquals(expected, actual);

    }

}