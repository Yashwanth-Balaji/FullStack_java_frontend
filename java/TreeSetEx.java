import java.util.LinkedHashSet;
//import java.util.TreeSet;
public class TreeSetEx {
    public static void main(String[] args) {
        /*TreeSet <Integer> ts = new TreeSet<>();
        System.out.println(ts);
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);

        System.out.println(ts);
        System.out.println(ts.ceiling(70));
        System.out.println(ts.lower(70));
        System.out.println(ts.floor(70));
        System.out.println(ts.higher(76));

        System.out.println(ts);*/


        LinkedHashSet<Object> lhs = new LinkedHashSet<>();
        lhs.add(234);
        lhs.add("Bhavana");
        lhs.add("Anil");
        lhs.add("Sravani");
        lhs.add(76554);
        lhs.add(2345);

        System.out.println(lhs);
    }
}
