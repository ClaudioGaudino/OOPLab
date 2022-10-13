import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    @Test
    public void addGasTest()
    {
        Car car = new Car(100d, 0.07d);
        car.addGas(50d);
        Assert.assertEquals(150d, car.getGas(), 0);
    }

    @Test
    public void driveTest()
    {
        Car car = new Car(100d, 5d);
        car.drive(5);
        Assert.assertEquals(75d, car.getGas(), 0);
        car.drive(1000);
        Assert.assertEquals(0, car.getGas(), 0);
    }
}