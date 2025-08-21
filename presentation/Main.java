@FunctionalInterface
interface Bird {
    void canFly(String val);  // Functional interface with one abstract method
}

public class Main {
    public static void main(String[] args) {
        Bird eagleObject = new Bird() {
            @Override
            public void canFly(String val) {
                System.out.println("Eagle Bird Implementation");
            }
        };

        eagleObject.canFly("vertical");
    }
}
