import java.util.*;


public class Str{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //concatenation
        String fname = "Shlok";
        String lname = "Srivastava";
        String fullName = fname + " " + lname;

        System.out.println(fullName);


        //length
        System.out.println(fullName.length());


        //chatAt -> print all characters

        for(int i=0; i<fullName.length(); i++){
            System.out.print(fullName.charAt(i)+ " ");
        }

        System.out.println();


        //compare

        //1 s1 > s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1 < s2 : -ve value


        System.out.println(fullName);
        
        if(fname.compareTo(lname) == 0){
            System.out.println("Equal");
        }



    }
}