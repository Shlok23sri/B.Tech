import java.util.*;

class Parent{
    int m1,m2,m3,m4,m5;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.err.println("========== Enter 5 Subjects marks ==========");
        
        System.err.print("Subject 01 : ");
        m1 = sc.nextInt();

        System.err.print("Subject 02 : ");
        m2 = sc.nextInt();

        System.err.print("Subject 03 : ");
        m3 = sc.nextInt();

        System.err.print("Subject 04 : ");
        m4 = sc.nextInt();

        System.err.print("Subject 05 : ");
        m5 = sc.nextInt();
    }
}


class Student extends Parent{
    int total, avg;
    public void compute(){
        total = m1 + m2 + m3 + m4 + m5;
        avg = total / 5;
    }
    public void show(){
        System.out.println("Total marks : " + total);
        System.out.println("Average marks : " + avg);
    }
}

public class Shlok{
    public static void main(String args[]){
        System.out.println("========== Inheritance ==========");
        Student s = new Student();

        s.input();
        s.compute();
        s.show();
    }
}