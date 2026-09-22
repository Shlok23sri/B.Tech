import java.util.*;


public class Function{

    public static int sum(int a, int b){ //function parameters
        int sum = a + b;
        System.out.println("Sum = "+sum);
        return sum;
    }

    public static void factorial(int n){
        if(n < 0){
            System.out.println("Invalid Number");
            return;
        }
        int fact = 1;
        for(int i = n; i >=1;i-- ){
            fact *= i;
        }
        System.out.println("Factorial of "+n+" = "+fact);
        return;
    }
    public static void main(String args[]){


        System.out.println("================ Function ================");

        sum(2,5);  //function calling , function arguments
        factorial(5);




    }
}