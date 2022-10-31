package it.unisa.railways;

import java.util.List;

public class Train {

    private TrainStop start;
    private TrainStop end;
    private List<TrainStop> intermediateStops;

    private int seats;
    private double distanceTraveled;

    public Train(TrainStop start, TrainStop end, List<TrainStop> intermediateStops, int seats, double distanceTraveled)
    {
        this.start = start;
        this.end = end;
        this.intermediateStops = intermediateStops;
        this.seats = seats;
        this.distanceTraveled = distanceTraveled;
    }

    public TrainStop getStart(){return start;}
    public TrainStop getEnd(){return end;}
    public int getSeats(){return seats;}
    public double getDistanceTraveled(){return distanceTraveled;}

    public int getTotalNumberOfStops() { return intermediateStops.size() + 2; }

    public double computeMaxRevenues(double kmPrice)
    {
        return distanceTraveled * seats * kmPrice;
    }
}