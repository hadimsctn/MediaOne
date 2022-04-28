package Model;

public class Spend {
    private Salary manager;
    private Salary employee;
    private int electricity;
    private int water;
    private int rent;

    public Spend(Salary manager, Salary employee, int electricity, int water, int rent) {
        this.manager = manager;
        this.employee = employee;
        this.electricity = electricity;
        this.water = water;
        this.rent = rent;
    }

    public Salary getManager() {
        return manager;
    }

    public void setManager(Salary manager) {
        this.manager = manager;
    }

    public Salary getEmployee() {
        return employee;
    }

    public void setEmployee(Salary employee) {
        this.employee = employee;
    }

    public int getElectricity() {
        return electricity;
    }

    public void setElectricity(int electricity) {
        this.electricity = electricity;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }
}
