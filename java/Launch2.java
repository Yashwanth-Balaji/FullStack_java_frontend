class Parent{
    void eat(){
        System.out.println("Eating");
    }
    void sleep(){
        System.out.println("Parent is sleeping");
    }
    void run(){
        System.out.println("Run for 20 hrs");
    }
}

class Child extends Parent{
    void sleep(){
        System.out.println("Child sleeps at 1 AM");
    }
    void swim(){
        System.out.println("Child is Swimming");
    }
}
public class Launch2{
    public static void main(String args[]){
        Child c=new Child();
        c.eat();
        c.sleep();
        c.run();
        c.swim();
    }
}