package Ejercicio_27_Herencia;

public class Student extends Person {
    private double score;
    private String school;

    public Student(String name, int age, double score, String school) {
        super(name, age);
        this.score = score;
        this.school = school;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void showInfo(){
        System.out.println("Name: " + getName() + "\nAge: " + getAge() + "\nScore " + score + "\nSchool: " + school);
    }
}
