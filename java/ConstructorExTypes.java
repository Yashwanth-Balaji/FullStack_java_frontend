class ConstructorExTypes{
    // Constructor with no parameters
    ConstructorExTypes() {
        System.out.println("Default constructor called");
    }

    // Constructor with one parameter
    ConstructorExTypes(int a) {
        System.out.println("Constructor with one parameter called: " + a);
    }

    // Constructor with two parameters
    ConstructorExTypes(int a, int b) {
        System.out.println("Constructor with two parameters called: " + a + ", " + b);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        ConstructorExTypes obj1 = new ConstructorExTypes();
        ConstructorExTypes obj2 = new ConstructorExTypes(10);
        ConstructorExTypes obj3 = new ConstructorExTypes(20, 30);
    }
}