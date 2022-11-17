package it.unisa.company;

public class Manager extends Employee {

    private String expertiseArea;
    private int workedHours;

    public Manager(String name, String lastName, String jobTitle, float hourlyWage, String expertiseArea)
    {
        super(name, lastName, jobTitle, hourlyWage);
        this.expertiseArea = expertiseArea;
    }

    public String getExpertiseArea() {
        return expertiseArea;
    }

    public void setExpertiseArea(String expertiseArea) {
        this.expertiseArea = expertiseArea;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    @Override
    public double computeWeeklyRevenue()
    {
        if(workedHours <= 40) return workedHours * super.getHourlyWage();
        else return 40 * super.getHourlyWage() + (workedHours - 40) * super.getHourlyWage() * 1.5;
    }

    /* TODO */

    @Override
    public String toString() {
        return super.toString() +
                ", Area di competenza='" + expertiseArea + '\'';
    }
}
