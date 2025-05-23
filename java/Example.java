abstract class E1{
    abstract void function1();
    static void function2(){
        System.out.println("This is function2");
    }
    static void function3(){
        System.out.println("This is function3");
    }
}
class E2 extends E1{
    void function1(){
        System.out.println("This is function1");
    }
}
public class Example {
    public static void main(String args[]){
        E2 e=new E2();
        e.function1();
        e.function2();
        e.function3();
    }
}


// Example.java:2: error: missing method body, or declare abstract
//     static void function1();
//                 ^
// 1 error
// PS D:\Jainx\java> javac Example.java
// Example.java:2: error: illegal combination of modifiers: abstract and static
//     abstract static void function1();
//                          ^
// on1() in Example
// class Example{
// ^
// 2 errors
// PS D:\Jainx\java> javac Example.java
// Example.java:2: error: illegal combination of modifiers: abstract and static
//     abstract static void function1();
// 1 error
// PS D:\Jainx\java> javac Example.java
// Example.java:11: error: non-static method function1() cannot be referenced from a static context
//         function1();
//         ^
// 1 error
// PS D:\Jainx\java> javac Example.java
// Example.java:11: error: Example is abstract; cannot be instantiated
//         Example e=new Example();
//                   ^
// 1 error