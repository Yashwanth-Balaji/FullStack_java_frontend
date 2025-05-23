abstract class Plane{
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
}