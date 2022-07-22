package Employee;

public class Program {
    public static void main(String[] args) {

        Employee em1 = new Employee("Petrova Varia", 220, 160);
        Employee em2 = new Employee("Ivanov Ivan", 300, 140);
        Employee em3 = new Employee("Petrova Varia", 250, 150);
        System.out.println(em1);
        System.out.println(em2);
        System.out.println(em3);
        Employee.totalSum=(em1.getSalary()+em2.getSalary()+em3.getSalary());
        System.out.println("Salary of all workers: " +Employee.totalSum);

    }
}
