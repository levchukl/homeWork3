package Person;

public class Program {
    public static void main(String[] args) {
        Person pr1 = new Person("Max", "Maxsimov", 1973);
        Person pr2 = new Person("Ivan", "Ivanov", 2005);
        Person pr3 = new Person("Anna", "Miler", 1998);
        Person pr4 = new Person("Vika", "Grey", 2002);
        Person pr5 = new Person("Ira", "Zykh", 1965);
        System.out.println(pr1);
        int result1 = pr1.getAge();
        System.out.println("Age "+result1);
        System.out.println(pr2);
        int result2 = pr2.getAge();
        System.out.println("Age "+result2);
        System.out.println(pr3);
        int result3 = pr3.getAge();
        System.out.println("Age "+result3);
        System.out.println(pr4);
        int result4 = pr4.getAge();
        System.out.println("Age "+result4);
        System.out.println(pr5);
        int result5 = pr5.getAge();
        System.out.println("Age "+result5);
    }
}
