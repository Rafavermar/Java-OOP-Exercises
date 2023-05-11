package Ejercicio_27_Herencia;

import Ejercicio_10_Polimorfismo.Persona;

public class Developer extends Person {
    private double salary;
    private String company;

    public Developer(String name, int age, double salary, String company){
        super(name, age);
        this.salary = salary;
        this.company = company;

    }

    public void showInfo(){
        System.out.println("Name: " + getName() + "\nAge: " + getAge() + "\nSalary: " + salary + "\nCompany: " + company);
    }
}
