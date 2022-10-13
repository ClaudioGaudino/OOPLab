public class Car {
    private double gas;
    private final double consumptionRate;

    public Car(double initialGas, double consumptionRate)
    {
        gas = initialGas;
        this.consumptionRate = consumptionRate;
    }

    public double getGas() {
        return gas;
    }

    public void addGas(double gas) {
        this.gas += gas;
    }

    public void drive(double km) {
        double consumption = km * consumptionRate;
        if(consumption <= gas)
            gas -= consumption;
        else
            gas = 0;
    }
}