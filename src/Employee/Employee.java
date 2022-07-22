package Employee;

public class Employee {


    private String name;
    private double rate;
    private Integer hours;

    public static double totalSum;

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, Integer hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public Integer getHours() {
        return hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double getSalary() {

        return getRate()*getHours();
    }

    @Override
    public String toString() {
        return ("Name of Employee: " + name + ", rate: " + rate + " hours: " + hours);

    }

   public void changeRate(double rate) {
        this.rate=rate;
    }

    public double getBonuses() {
        return getSalary() *0.1;
    }
}