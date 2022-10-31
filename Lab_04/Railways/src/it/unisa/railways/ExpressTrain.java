package it.unisa.railways;

import java.util.List;

public class ExpressTrain extends Train {

    private int restaurantSeats;

    public ExpressTrain(TrainStop start, TrainStop end, List<TrainStop> intermediateStops, int seats, double distanceTraveled, int restaurantSeats)
    {
        super(start, end, intermediateStops, seats, distanceTraveled);
        this.restaurantSeats = restaurantSeats;
    }

    public double computeMaxRevenues(double kmPrice, double restaurantKmPrice)
    {
        return (super.getDistanceTraveled() * kmPrice * super.getSeats()) + (super.getDistanceTraveled() * restaurantKmPrice * restaurantSeats);
    }

}
