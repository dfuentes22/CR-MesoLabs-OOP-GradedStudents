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

    //display all exam scores
    public String getExamScores() {
        String scores = "Exam Scores: \n\t";
        Integer count = 1;
        for (int i = 0; i < this.examScores.size(); i++){
            scores += "Exam " + count + " -> " + this.examScores.get(i) + "\n\t";
            count++;
        }
        return scores;
    }

    //add an Exam Score
    public void addExamScore(Double examScore){
        this.examScores.add(examScore);
    }

    //update an exam score
    public void setExamScore(Integer examNumber, Double newScore){
        int minusindex = examNumber - 1;
        this.examScores.set(minusindex, newScore);
    }

    //get average exam score
    public Double getAverageExamScore(){
        Double sum = 0.0;
        for(Double d : this.examScores){
            sum += d;
        }
        Double avg = sum / this.examScores.size();

        return avg;
    }

    //override toString()
    public String toString(){
        String student = "Student Name: " + this.firstName + " " + this.lastName + "\n"
                + "Average Score: " + this.getAverageExamScore() + "\n"
                + "Exam Scores:" + this.firstName + " " + this.lastName + "\n\t";
        Integer count = 1;
        for (int i = 0; i < this.examScores.size(); i++){
            student += "Exam " + count + " -> " + this.examScores.get(i) + "\n\t";
            count++;
        }
        return student;
    }

    //display all info method
    public void display(){
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        for(Double item : this.examScores){
            System.out.println(item);
        }
    }

    public static void main(String []args) {
        // Create Student object
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.toString();

        // Then
        System.out.println(output);

    }
}