// Base calculator interface
interface calculator1 {
    int a = 10; // implicitly public static final
    void add();
    void sub();
}

// calculator2 extends calculator1
interface calculator2 extends calculator1 {
    void mul();
    void div();
}

// calculator3 extends calculator1 and adds all methods explicitly
interface calculator3 extends calculator1 {
    void mul();
    void div();
}

// Another independent interface
interface calculator4 {
    void add1();
    void add2();
}

// Implements calculator1
class SampleCode1 implements calculator1 {
    @Override
    public void add() {
        System.out.println("Inside the method add() of SampleCode1");
    }

    @Override
    public void sub() {
        System.out.println("Inside the method sub() of SampleCode1");
    }
}

// Another implementation of calculator1
class SampleCode2 implements calculator1 {
    @Override
    public void add() {
        System.out.println("Inside the method add() of SampleCode2");
    }

    @Override
    public void sub() {
        System.out.println("Inside the method sub() of SampleCode2");
    }
}

// Implements calculator2 only (calculator1 is inherited)
class SampleCode3 implements calculator2 {
    @Override
    public void add() {
        System.out.println("Inside the method add() of SampleCode3");
    }

    @Override
    public void sub() {
        System.out.println("Inside the method sub() of SampleCode3");
    }

    @Override
    public void mul() {
        System.out.println("Inside the method mul() of SampleCode3");
    }

    @Override
    public void div() {
        System.out.println("Inside the method div() of SampleCode3");
    }
}

// Empty interface (used for demonstration)
interface calculator5 { }

// Superclass
class SampleCode4 {
    void display() {
        System.out.println("Display() of SampleCode4");
    }
}

// Subclass extends class and implements interface
class SampleCode5 extends SampleCode4 implements calculator1 {
    @Override
    public void add() {
        System.out.println("Inside the method add() of SampleCode5");
    }

    @Override
    public void sub() {
        System.out.println("Inside the method sub() of SampleCode5");
    }
}

// Interface with default and static methods
interface calculator6 {
    void add();
    void sub();

    default void multiplication() {
        System.out.println("Default method multiplication() in calculator6");
    }

    static void division() {
        System.out.println("Static method division() in calculator6");
    }
}

// Abstract class implementing interface with partial implementation
abstract class SampleCode6 implements calculator6 {
    @Override
    public void add() {
        System.out.println("Implemented add() in SampleCode6");
    }

    // sub() method not implemented, class remains abstract
}

// Testing class with main method
public class Test {
    public static void main(String[] args) {
        // Anonymous class implementing calculator1
        calculator1 c3 = new calculator1() {
            @Override
            public void add() {
                System.out.println("Inside add() of anonymous class c3");
            }

            @Override
            public void sub() {
                System.out.println("Inside sub() of anonymous class c3");
            }
        };

        c3.add(); // Outputs: Inside add() of anonymous class c3
        c3.sub(); // Outputs: Inside sub() of anonymous class c3

        // Demonstrating default and static methods
        calculator6 calc6 = new calculator6() {
            @Override
            public void add() {
                System.out.println("Anonymous add() of calculator6");
            }

            @Override
            public void sub() {
                System.out.println("Anonymous sub() of calculator6");
            }
        };

        calc6.add();
        calc6.sub();
        calc6.multiplication();       // default method
        calculator6.division();       // static method
    }
}
