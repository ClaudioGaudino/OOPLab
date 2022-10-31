package it.unisa.quiz;

import java.util.ArrayList;
import java.util.List;

public class DataSet {

    private double sum;
    private Measurable maximum;
    private Measurable minimum;
    private int count;

    public DataSet() {
        sum = 0;
        count = 0;
    }

    public double getAverage() {
        return sum / count;
    }

    public Measurable getMaximum() {
        return maximum;
    }

    public Measurable getMinimum() {
        return minimum;
    }

    public void add(Measurable x) {
        count++;
        sum += x.getMeasure();
        if(count == 1)
        {
            maximum = x;
            minimum = x;
        }
        else if(x.getMeasure() > maximum.getMeasure())
            maximum = x;
        else if(x.getMeasure() < minimum.getMeasure())
            minimum = x;
    }
}