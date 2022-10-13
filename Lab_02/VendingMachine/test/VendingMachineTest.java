import org.junit.Assert;
import org.junit.Test;

public class VendingMachineTest {

    @Test
    public void addCansTest()
    {
        VendingMachine v = new VendingMachine(10);
        v.addCans(5);
        Assert.assertEquals(15, v.getNumberOfCans(), 0);
    }

    @Test
    public void removeTakeCanTest()
    {
        VendingMachine v = new VendingMachine(10);
        v.takeCan();
        Assert.assertEquals(9, v.getNumberOfCans(), 0);
        Assert.assertEquals(1, v.getNumberOfTokens(), 0);
        v.takeTokens();
        Assert.assertEquals(0, v.getNumberOfTokens(), 0);
    }
}