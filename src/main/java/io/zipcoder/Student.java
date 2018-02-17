package io.zipcoder;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class Student {

    //variables
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    //Student Constructor
    public Student(String firstName, String lastName, Double[] examScores) {
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.examScores = new ArrayList<Double>(Arrays.asList(examScores));
        }
    }

    public void display(){
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        for(Double item : this.examScores){
            System.out.println(item);
        }
    }

    public static void main(String []args) {
        // Create Student object
        Double[] scores = { 100.0, 95.0, 123.0, 96.0 };
        Student test = new Student("Daniel", "Fuentes", scores);

        test.display();
    }

}