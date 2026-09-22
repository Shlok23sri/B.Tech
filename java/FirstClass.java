import java.util.*;


public class FirstClass{
    public static void main(String args[]){
        
        //output
        System.out.println("Hello world");


        //input
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter your name : ");
        String name = sc.nextLine();   //nextLine for take input complete sentense
        
        System.out.print("Enter your age : ");
        int age = sc.nextInt();   //nextLine for take int input


        System.out.println(" ");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        

        //variables
        // String name = "Shlok srivastava";
        // int age = 21;

        // System.out.println("Name : "+ name);
        // System.out.println("Age : "+ age);

        int a = 10;
        int b = 5;

        int ans = (a * b) / (a - b);
        System.out.println(ans);
    }
}