import java.util.*;

public class TwoDArray{
    public static void main(String[] args) {
        

        //type[][] arrayname = new type[rows][columns];

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter cols : ");
        int cols = sc.nextInt();



        int[][] numbers = new int[rows][cols];

        //input 

        //rows
        for(int i=0; i<rows; i++){
            //columns
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println();


        //output
        for(int i=0;i < rows; i++){
            //columns
            for(int j=0; j<cols;j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}