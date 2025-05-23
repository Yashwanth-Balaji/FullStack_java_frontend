/*abstract class Plane{
    abstract void takeOff();
    void fly(){
        System.out.println("Plane is flying");
    }
    void land(){
        System.out.println("Plane has landed");
    }
}

class Boeing extends Plane{
    void takeOff(){
        System.out.println("Plane is Taking Off");
    }
}

public class Flignt{
    public static void main(String args[]){
        Boeing p=new Boeing();
        p.takeOff();
        p.fly();
        p.land();
    }
}*/


abstract class Plane{
    void takeOff(){
        System.out.println("Plane TookOff");
    }
    abstract void fly();
    void land(){
        System.out.println("Plane has landed");
    }
}

class CargoPlane extends Plane{
    @Override
    void fly(){
        System.out.println("CargoPlane is flying");
    }
}

public class Flight{
    public static void main(String args[]){
        CargoPlane p=new CargoPlane();
        p.takeOff();
        p.fly();
        p.land();

        Plane ref=new Plane(){
        @Override
        void fly(){
            System.out.println("Plane is flying");
        }
    };
    ref.fly();
    }

    
}