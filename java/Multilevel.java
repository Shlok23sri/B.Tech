import java.util.*;

class A{
    int m1,m2,m3,m4,m5;
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.print("Enter marks of 5 Subjects : ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();
    }
}

class B extends A{
    int total,avg;
    void compute(){
        total = m1 + m2 + m3 + m4 + m5;
        avg = total / 5;
    }
}


class C extends B{
    void display(){
        System.out.println("Subject 1 Marks : " + m1);
        System.out.println("Subject 2 Marks : " + m2);
        System.out.println("Subject 3 Marks : " + m3);
        System.out.println("Subject 4 Marks : " + m4);
        System.out.println("Subject 5 Marks : " + m5);
        System.out.println("Total marks : " + total);
        System.out.println("Average marks : " + avg);

        if(total >= 60){
            System.out.println("First");
        }else if(total >= 50){
            System.out.println("Second");
        }else if(total >= 40){
            System.out.println("Third");
        }else if(total < 40){
            System.out.println("Fail");
        }else{
            System.out.println("Not Valid!");
        }
    }
}

public class Multilevel{
    public static void main(String args[]){
        C a = new C();
        a.input();
        a.compute();
        a.display();
    }
}