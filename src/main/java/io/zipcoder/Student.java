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

    //Getter firstName
    public String getFirstName() {
        return this.firstName;
    }

    //Setter firstName
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    //Getter lastName
    public String getLastName() {
        return this.lastName;
    }

    //Setter lastName
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    //Getter for Number of exams taken
    public Integer getNumberOfExamsTaken() {
        int numOfExams = 0;
        for (Double exam: this.examScores){
            numOfExams++;
        }
        return numOfExams;
    }

    //Getter for all exam scores
    public String getExamScores() {
        String scores = "Exam Scores: \n\t";
        Integer count = 1;
        for (int i = 0; i < this.examScores.size(); i++){
            scores += "Exam " + count + " -> " + this.examScores.get(i) + "\n\t";
            count++;
        }
        return scores;
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

        System.out.println(test.getExamScores());

    }
}