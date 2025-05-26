import java.util.*;
interface shape{
    double area();
    double perimeter();
    
}

class Rectangle implements shape{
    double l;
    double b;
    public void getDetails(double l,double b){
       
        this.l=l;
        this.b=b;
    }
    @Override
    public double area(){
        return l*b;
    }
    @Override
    public double perimeter(){
        return (l+b)+(l+b);
    }
}
class Square implements shape{
    double side;
    Scanner sc=new Scanner(System.in);
    public void getDetails(double side){
        side=sc.nextDouble();
        this.side=side;
    }

    @Override
    public double area(){
        return side*side;
    }

    @Override
    public double perimeter(){
        return 4*side;
    }
}

class Circle implements shape{
    double r;
    public void getDetails(double r){
        this.r=r;
    }
    

    @Override
    public double area(){
        return 3.14*r*r;
    }

    @Override
    public double perimeter(){
        return 2*3.14*r;
    }
}
public class Interface_shape {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Scanner sc=new Scanner(System.in);
        double l=sc.nextDouble();
        double b=sc.nextDouble();

        r.getDetails(l,b);
        System.out.println(r.area());
        System.out.println(r.perimeter());

        Circle c=new Circle();
       // Scanner sc=new Scanner(System.in);
        double radi=sc.nextDouble();
        c.getDetails(radi);
        System.out.println(c.area());
        System.out.println(c.perimeter());
        

        Square s=new Square();
        double d=sc.nextDouble();
        s.getDetails(d);
        System.out.println(s.area());
        System.out.println(s.perimeter());
        sc.close();
    }
}