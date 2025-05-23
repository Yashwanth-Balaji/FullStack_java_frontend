import java .util.Scanner;
abstract class Shape {
    Scanner sc=new Scanner(System.in);
    abstract void collectData();
    abstract void calculate();
    double area=0;
    void display(){
        System.out.println("Area = "+area);
    }
}

class Circle extends Shape{
    private double r;
    static double pi=3.14;

    @Override
    void collectData(){
        System.out.println("Enter Radius of the Circle");
        r=sc.nextDouble();
    }
    @Override
    void calculate(){
        area = pi*r*r;
    }
}

class Rectangle extends Shape{
    private double l;
    private double b;

    @Override 
    void collectData(){
        System.out.println("Enter the Dimensions of the Rectangle");
        System.out.println("Enter The Length =");
        l=sc.nextDouble();
        System.out.println("Enter The Breadth =");
        b=sc.nextDouble();
    }

    @Override
    void calculate(){
        area=l*b;
    }
}


class Square extends Shape{
    private double s;

    @Override
    void collectData(){
        System.out.println("Enter the side of the Square = ");
        s=sc.nextDouble();
    }

    @Override
    void calculate(){
        area=s*s;
    }
}
class All_Shapes{
    public static void main(String args[]){
        Circle c=new Circle();
        c.collectData();
        c.calculate();
        c.display();

        Rectangle r=new Rectangle();
        r.collectData();
        r.calculate();
        r.display();

        Square s=new Square();
        s.collectData();
        s.calculate();
        s.display();
    }
}