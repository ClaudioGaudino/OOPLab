import org.junit.Assert;
import org.junit.Test;

public class InfectedTest {

    @Test
    public void testBuilder()
    {
        Infected infected = new Infected("disease", 100);
        String disease = "disease";
        Assert.assertEquals(disease, infected.getDisease());
        Assert.assertEquals(100, infected.getNumberOfInfected(), 0);
    }

    @Test
    public void testInfected()
    {
        Infected infected = new Infected("disease", 100);
        infected.addInfected(100);
        Assert.assertEquals(200, infected.getNumberOfInfected(), 0);
        infected.updateInfectedByRt(50);
        Assert.assertEquals(300, infected.getNumberOfInfected(), 0);
    }
}