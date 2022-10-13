import org.junit.Assert;
import org.junit.Test;

public class LockerTest {

    @Test
    public void testLock()
    {
        Locker l = new Locker();
        l.lock();
        Assert.assertFalse(l.isOpen());
    }

    @Test
    public void testUnlock()
    {
        Locker l = new Locker();
        l.lock();
        l.unlock("");
        Assert.assertTrue(l.isOpen());
    }

    @Test
    public void testNewComb()
    {
        Locker l = new Locker();
        l.newComb("password");
        l.unlock("password");
        Assert.assertTrue(l.isOpen());
    }
}