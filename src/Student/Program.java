package Student;

public class Program {
    public static void main(String[] args) {
        Student st1=new Student("Ivanov Ivan", 90.6);
        Student st2=new Student("Petrova Anna", 87.0);
        Student st3 =new Student("Petrenko Petro", 97.4);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        if (Student.betterStudent(st1.getRating(), st2.getRating()) && Student.betterStudent(st1.getRating(), st3.getRating())){
            System.out.println(st1.getName()+ " the best");
        } else if (Student.betterStudent(st2.getRating(), st1.getRating()) && Student.betterStudent(st2.getRating(), st3.getRating())) {
            System.out.println(st2.getName()+ " the best");
        } else {
            System.out.println(st3.getName()+ " the best");
        }
        Student.avgRating= (st1.getRating()+ st2.getRating()+ st3.getRating())/3;
        System.out.printf("avgRaiting: %.2f", Student.avgRating );
    }
}
