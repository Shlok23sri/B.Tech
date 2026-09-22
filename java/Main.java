import java.util.*;
// use of this keyword

class Student{
    String name;
    int age;

    Student(){
        this("Shlok",21); //default values
    }

    Student(String n, int a){
        this.name = n;
        this.age = a;
    }
}


public class Main{
    public static void main(String args[]){
        System.out.println("Hello, World!");

        Student s = new Student("John", 20);
    }
}