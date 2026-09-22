import java.util.*;

class Abcd{
    int x;
    int y;
    int c;

    Abcd(int a, int b){
        x = a;
        y = b;
    }

    public void add(){
        c = x + y;
    }
    
    public void show(){
        System.out.println("Sum = " + c);
    }
}

public class Abc{
    public static void main(String args[]){
        
        int m,n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter m : ");
        m = sc.nextInt();
        
        System.out.print("Enter n : ");
        n = sc.nextInt();
        
        
        Abcd ob = new Abcd(m,n);

        ob.add();
        ob.show();




}
}