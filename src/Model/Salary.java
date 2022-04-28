package Model;

public class Salary {
    private String name;
    private int age;
    private int hourlyPayRate;
    private int time;

    public Salary(String name, int age, int hourlyPayRate, int time) {
        this.name = name;
        this.age = age;
        this.hourlyPayRate = hourlyPayRate;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(int hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}