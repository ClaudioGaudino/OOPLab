package it.unisa.quiz;

public class DataSet {

    private double sum;
    private Quiz minimum;
    private Quiz maximum;
    private int count;

    public DataSet() {
        count = 0;
        sum = 0;
    }

    public double getAverage() {
        if (count == 0) return 0;
        else return sum / count;
    }

    public Quiz getMaximum() {
        return maximum;
    }

    public Quiz getMinimum() {
        return minimum;
    }

    public void add(Quiz x) {
        count++;
        sum += x.getMeasure();
        if(count == 1)
        {
            minimum = x;
            maximum = x;
        }
        else if(maximum.compareTo(x.getMeasure()) < 0)
            maximum = x;
        else if(minimum.compareTo(x.getMeasure()) > 0)
            minimum = x;
    }
}