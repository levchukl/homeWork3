package Student;

 public class Student {
     private String name;
     private double rating;
     public static double avgRating;

     public Student() {
     }

     public Student(String name, double rating) {
         this.name = name;
         this.rating = rating;
     }


     void displayInfo() {
         System.out.printf("Name: %s \tRating %d\f", name, rating);
     }

     public String getName() {
         return name;
     }

     public double getRating() {
         return rating;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setRating(Integer rating) {
         this.rating = rating;
     }

     public static boolean betterStudent(double ratingStudent1, double ratingStudent2) {
         boolean result=false;
         if (ratingStudent1>ratingStudent2) {
         return true;
        }
         return result;
        }
    @Override
    public String toString(){
             return ("Name of student: "+name+", rating: "+rating);
    }
}
