import java.util.*;


public class Loops{
    public static void main(String args[]){


        System.out.println("================ Loops ================");


        // for(int i = 1; i < 11; i++){
        //     System.out.print(i+" ");
        // }

        // System.out.println(" ");
        
        // int i = 0;
        
        // while(i < 5){
        //     System.out.print(i+" ");
        //     i++;
        // }
        
        // System.out.println(" ");

        // int n = 10;
        // do{
        //     System.out.print(n+" ");
        //     n++;
        // }while(n < 9);

        int sum = 0;

        for(int i = 0; i <= 4; i++){
            sum += i;
        }

        System.out.println(sum);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n  = sc.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }




    }
}