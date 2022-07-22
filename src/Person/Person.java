package Person;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;


    public Person() {
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName=lastName;
        this.birthYear=birthYear;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYar() {
        return birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public void setBirthYar(int birthYar) {
        this.birthYear = birthYar;
    }
    public int getAge() {
        LocalDate date=LocalDate.now();
        int dateYer=date.getYear();
        return (dateYer-birthYear);
    }
    public void input(String firstName, String lastName, int birthYear){
        setFirstName(firstName);
        setLastName(lastName);
        setBirthYar(birthYear);
    }
    public void changeName(String fn, String ln) {
        setLastName(ln);
        setFirstName(fn);
    }

    @Override
    public String toString() {
        return("Information about person:" +firstName+" "+lastName+", "+birthYear);
    }

}
