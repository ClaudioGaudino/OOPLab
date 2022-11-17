package it.unisa.company;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void employerInitialWageTest() {
        Employee employee = new Employee("John", "Smith", "Consultant", 50);
        Assert.assertEquals(50, employee.getHourlyWage(), 0.001);
    }

    @Test
    public void setHourlyWageTest() {
        Employee employee = new Employee("John", "Smith", "Consultant", 50);
        employee.setHourlyWage(60);
        Assert.assertEquals(60, employee.getHourlyWage(), 0);
    }

    @Test
    public void computeRevenueTest()
    {
        Employee employee = new Employee("John", "Smith", "Consultant", 500);
        Assert.assertEquals(40*500, employee.computeWeeklyRevenue(), 0);
    }
}