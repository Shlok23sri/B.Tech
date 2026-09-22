
class Circle{
    double pi = 3.14;

    void area(double r){
        double area = pi * r * r;
        System.out.println("Radius : " + r); 
        System.out.println("Area of Circle : " + area); 
    }
}


class Rectangle{
    void area(double h, double w){
        double area = h * w;
        System.out.println("Height : " + h);
        System.out.println("Width : " + w);
        System.out.println("Area of Rectangle : " + area);
    }
}


public class Area{
    public static void main(String args[]){
        Circle c = new Circle();
        Rectangle rec = new Rectangle();

        c.area(7);
        rec.area(5,4);
    }
}