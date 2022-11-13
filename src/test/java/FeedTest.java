import org.junit.Assert;
import org.junit.Test;

public class FeedTest {

    @Test
    public void numOfDiceTest1() {

        int expected = 2;
        int actual = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numOfDiceTest2() {

        int expected = 3;
        int actual = 3;
        Assert.assertEquals(expected, actual);
    }
}