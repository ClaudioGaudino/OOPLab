import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.List;

public class CarSellerTest {

    @Test
    public void baseFindTest()
    {
        CarSeller seller = new CarSeller();
        File file = Path.of("test/").resolve("testData.txt").toFile();
        try
        {
            seller.addCarsFromFile(file);
        }
        catch(FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }

        Assert.assertFalse(seller.find("Alfa Romeo", "MITO"));
        Assert.assertTrue(seller.find("Toyota", "Supra"));
    }

    @Test
    public void yearFindTest()
    {
        CarSeller seller = new CarSeller();
        File file = Path.of("test/").resolve("testData.txt").toFile();
        try
        {
            seller.addCarsFromFile(file);
        }
        catch(FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }

        Assert.assertFalse(seller.find("Honda", "Civic Type R", 2023));
        Assert.assertTrue(seller.find("Audi", "Sport Quattro", 1980));
    }

    @Test
    public void priceFindTest()
    {
        CarSeller seller = new CarSeller();
        File file = Path.of("test/").resolve("testData.txt").toFile();
        try
        {
            seller.addCarsFromFile(file);
        }
        catch(FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }

        Assert.assertFalse(seller.find("Audi", "Sport Quattro", 10, 15));
        Assert.assertTrue(seller.find("Lancia", "Delta S4", 4000, 67000));
    }
}