import java.util.*;


public class Conditions{
    public static void main(String[] args) {

        //input
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter age : ");
        // int age = sc.nextInt();

        // if(age > 18){
        //     System.out.println("You can drive");
        // }else{
        //     System.out.println("You cannot drive");
        // }


        // System.out.print("Enter number : ");
        // int num = sc.nextInt();


        // if(num%2 == 0){
        //     System.out.println("Even Number");
        // }else{
        //     System.out.println("Odd Number");
        // }

        // System.out.print("a : ");
        // int a = sc.nextInt();

        // System.out.print("b : ");
        // int b = sc.nextInt();


        // if(a == b){
        //     System.out.println("Equal");
        // }else if(a > b){
        //     System.out.println("A is greater");
        // }else if(b > a){
        //     System.out.println("B is greater");
        // }else{
        //     System.out.println("Not valid");
        //}

        System.out.print("Enter number(1, 2, 3) : ");
        int btn = sc.nextInt();

        switch(btn){
            case 1 : System.out.println("Java");
            break;

            case 2 : System.out.println("Python");
            break;

            case 3 : System.out.println("JavaScript");
            break;

            default : System.out.println("Invalid...");
        }
    }
}