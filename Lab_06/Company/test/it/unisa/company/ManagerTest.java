package it.unisa.company;

import org.junit.Assert;
import org.junit.Test;

public class ManagerTest {

    @Test
    public void employerInitialWageTest() {
        Manager manager = new Manager("John", "Smith", "Area Director", 500, "Human Resources");
        Assert.assertEquals(500, manager.getHourlyWage(), 0.001);
    }

    @Test
    public void setWorkedHoursTest() {
        Manager manager = new Manager("John", "Smith", "Area Director", 500, "Human Resources");
        manager.setWorkedHours(20);
        Assert.assertEquals(20, manager.getWorkedHours(), 0.001);
    }

    @Test
    public void setHourlyWageTest() {
        Manager manager = new Manager("John", "Smith", "Area Director", 500, "Human Resources");
        manager.setWorkedHours(20);
        manager.setHourlyWage(600);
        Assert.assertEquals(600, manager.getHourlyWage(), 0.001);
    }

    @Test
    public void computeWeeklyRevenueTest()
    {
        Manager manager = new Manager("John", "Smith", "Area Director", 500, "Human Resources");
        manager.setWorkedHours(30);
        Assert.assertEquals(30*500, manager.computeWeeklyRevenue(), 0.001);
        manager.setWorkedHours(45);
        Assert.assertEquals(40*500 + 5 * 500 * 1.5, manager.computeWeeklyRevenue(), 0.001);
    }
}