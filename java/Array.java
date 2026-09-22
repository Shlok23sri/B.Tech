import java.util.*;


public class Array{

    
    public static void main(String args[]){


        System.out.println("================ Arrays ================");

        // int marks[] = new int[3]; // Defining an array(1)
        // int points[] = {11, 22, 33}; // Defininf an array(2)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        //input
        for(int i=0; i<size;i++){
            System.out.print("Enter element of index "+i+" : ");
            numbers[i] = sc.nextInt();
        }


        //output
        for(int i=0; i<size;i++){
            System.out.println("Element at index "+i+" : "+ numbers[i]);
        }




    }
}