package it.unisa.country;

import org.junit.Assert;
import org.junit.Test;

public class DataSetTest {
    @Test
    public void testMinimum() {
        Country c1 = new Country("Joe", 69);
        Country c2 = new Country("Mama", 420);
        Country c3 = new Country("name", 300);
        DataSet dataSet = new DataSet();
        dataSet.add(c1);
        dataSet.add(c2);
        dataSet.add(c3);
        Assert.assertEquals(69, dataSet.getMinimum().getSurfaceArea(), 0);
    }

    @Test
    public void testMaximum() {
        Country c1 = new Country("Joe", 69);
        Country c2 = new Country("Mama", 420);
        Country c3 = new Country("name", 300);
        DataSet dataSet = new DataSet();
        dataSet.add(c1);
        dataSet.add(c2);
        dataSet.add(c3);
        Assert.assertEquals(420, dataSet.getMaximum().getSurfaceArea(), 0);
    }
}