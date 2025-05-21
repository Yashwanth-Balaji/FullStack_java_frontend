class A{
    public void printA(){
        System.out.println("A");
    }
}

class B extends A{
    public void printB(){
        System.out.println("B");
    }
}

class C extends A{
    public void printC(){
        System.out.println("C");
    }
}

class D extends A{
    public void printD(){
        System.out.println("D");
    }
}


class Hierarchical{
    public static void main(String args[]){
        B b=new B();
        b.printA();
        b.printB();

        C c=new C();
        c.printA();
        c.printC();

        D d=new D();
        d.printA();
        d.printD();
    }
}