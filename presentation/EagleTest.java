

@FunctionalInterface
interface Bird {
    void canFly(String val);  // Single abstract method
}

@FunctionalInterface
interface Live extends Bird{
    void canFly(String val);
}

class Eagle implements Bird {
    @Override
    public void canFly(String val) {
        System.out.println("Eagle Bird Implementation: Flying " + val);
    }
}

public class EagleTest {
    public static void main(String[] args) {
        Bird eagleObject = new Eagle();
        eagleObject.canFly("vertical");
    }
}
