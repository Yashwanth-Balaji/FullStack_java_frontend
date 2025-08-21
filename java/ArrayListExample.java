import java.util.ArrayList;
import java.util.LinkedList;
class Demo{
    String s;
    int i;
    float f;
}
public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList <Integer> al = new ArrayList<>();
        // al.add(10);
        // al.add(35);
        // System.out.println(al);
        // System.out.println(al.indexOf(10));
        // al.add(24);
        // al.add(65);
        // al.add(76);
        // al.add(103);
        // System.out.println(al);
        // System.out.println(al.get(5));
        // System.out.println(al.contains(75));
        // System.out.println(al.contains(76));
        // System.out.println(al.size());
        // al.trimToSize();
        // System.out.println(al);
        // al.clear();
        // System.out.println(al);


        /*LinkedList <Integer> al = new LinkedList<>();
        al.add(10);
        al.add(35);
        System.out.println(al);
        System.out.println(al.indexOf(10));
        al.add(24);
        al.add(65);
        al.add(76);
        al.add(24);
        al.add(103);
        al.add(24);
        al.add(36);
        al.add(24);
        al.add(1223);
        System.out.println(al);
        System.out.println(al.get(5));
        System.out.println(al.contains(75));
        System.out.println(al.contains(76));
        System.out.println(al.size());
        //al.trimToSize();
        System.out.println(al);
        //al.clear();
        System.out.println(al);

        System.out.println(al.getFirst());
        System.out.println(al.getLast());
        System.out.println(al.lastIndexOf(24));
        al.addFirst(11);
        System.out.println(al);
        al.addLast(90);
        System.out.println(al);
        System.out.println(al.peekFirst());
        System.out.println(al.pollFirst());
        System.out.println(al);
        */

        //Demo d = new Demo();
        Demo d1 = new Demo();
        d1.s = "Yash";
        d1.i = 20;
        d1.f = 20.5f;
         Demo d2 = new Demo();
        d2.s = "Yash";
        d2.i = 20;
        d2.f = 20.5f;
        ArrayList<Demo> al = new ArrayList<>();
        al.add(d1);
        al.add(d2);
        System.out.println(al);


    }
}
