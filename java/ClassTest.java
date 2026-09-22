class Calculator{
    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }
    double add(double a, double b){
        return a + b;
    }
}

class Fact{
    int fact(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n * fact(n - 1);
    }
}


public class ClassTest{
    public static void main(String args[]){
        Calculator c = new Calculator();
        Fact f = new Fact();

        System.out.println("Sum of 2 int : "+ c.add(10,20));
        System.out.println("Sum of 3 int : "+ c.add(10,20,30));
        System.out.println("Sum of 2 double : "+ c.add(10.5,11.2));

        System.out.println("Factorial = "+ f.fact(4));
    }
}