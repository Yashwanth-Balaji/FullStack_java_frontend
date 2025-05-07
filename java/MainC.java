class StaticExample{

    static{
        System.out.println("first");
    }
    static int var=10;
    int instanceVar=20;
    static void staticMethod(){
        System.out.println("Static method is called");
    }
    void instanceMethod(){
        System.out.println("Instance method is called");
    }
}
public class MainC{
    public static void main(String args[]){
        System.out.println(StaticExample.var);
        //System.out.println(StaticExample.instanceVar);
        StaticExample ob1=new StaticExample();
        StaticExample ob2=new StaticExample();
        ob1.var=30;
        System.out.println(ob2.var);
        System.out.println(ob1.var);
        System.out.println(StaticExample.var);

    }
    static {
        System.out.println("This is a static block");
    }
}