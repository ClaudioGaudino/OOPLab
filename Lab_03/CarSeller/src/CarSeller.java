import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarSeller {
    private final List<Car> cars;

    public CarSeller() {
        this.cars = new ArrayList<>();
    }

    public void addCarsFromFile(File file) throws FileNotFoundException
    {
        String model, brand;
        int manufacturingYear;
        double price;
        Scanner in = new Scanner(file);
        while(in.hasNextLine())
        {
            model = in.nextLine();
            brand = in.nextLine();
            manufacturingYear = Integer.parseInt(in.nextLine());
            price = Double.parseDouble(in.nextLine());
            Car c = new Car(model, brand, manufacturingYear, price);
            cars.add(c);
        }
    }

    public boolean find(String brand, String model)
    {
        for(Car c : cars)
        {
            if(c.getBrand().equals(brand) && c.getModel().equals(model))
                return true;
        }
        return false;
    }

    public boolean find(String brand, String model, int minManufacturingYear)
    {
        for(Car c : cars)
        {
            if (c.getBrand().equals(brand)
                    && c.getModel().equals(model)
                    && c.getManufacturingYear() >= minManufacturingYear)
                return true;
        }
        return false;
    }

    public boolean find(String brand, String model, double minPrice, double maxPrice)
    {
        for(Car c : cars)
        {
            if(c.getBrand().equals(brand)
                    && c.getModel().equals(model)
                    && c.getPrice() <= maxPrice
                    && c.getPrice() >= minPrice)
                return true;
        }
        return false;
    }

}