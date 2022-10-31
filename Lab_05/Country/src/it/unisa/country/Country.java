package it.unisa.country;

public class Country implements Comparable<Country> {

    final private String name;
    final private double surfaceArea;

    public Country(String name, double surfaceArea) {
        this.name = name;
        this.surfaceArea = surfaceArea;
    }

    public String getName() {
        return name;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    @Override
    public int compareTo(Country c)
    {
        if(this.surfaceArea < c.getSurfaceArea())
            return -1;
        else if(this.surfaceArea == c.getSurfaceArea())
            return 0;
        else
            return 1;
    }

}