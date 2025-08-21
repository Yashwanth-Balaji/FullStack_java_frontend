import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.Comparator;
public class SortingArray {
    public static void main(String[] args) {
       /* ArrayList<Integer> al = new ArrayList<>();
        int arr[] = {1,3,2,4,6,22,0,12};
        al.add(23);
        al.add(234);
        al.add(1);
        al.add(3);
        al.add(45);

        System.out.println(al);

        Arrays.sort(arr);

        System.out.print("[");
        for(int i : arr){
            System.out.print(i+", ");
        }
        System.out.println("]");
    }
}
*/

/*
TreeSet<Object> ts = new TreeSet<>();

ts.add("1");
ts.add("8");
ts.add("3");
ts.add("5");
ts.add("a");
ts.add("x");
ts.add("p");
ts.add("b");
ts.add("2");
ts.add(new String("A"));
ts.add(new String("Y"));
ts.add(new String("T"));
//ts.add(new StringBuffer("Z"));
//ts.add(new StringBuffer("W"));

System.out.println("A".compareTo("a"));
System.out.println("K".compareTo("K"));
System.out.println("2".compareTo("K"));
System.out.println("K".compareTo("2"));

System.out.println("K".compareTo(null));

System.out.println(ts); */

        TreeSet<Object> ts = new TreeSet(new MyComparator());
        ts.add(12);
        ts.add(23);
        ts.add(2);
        ts.add(43);
        ts.add(65);
        ts.add(1);

        System.out.println(ts);

    }
}

class MyComparator implements Comparator{
    public int compare(Object obj1, Object obj2){
        Integer i1 = (Integer)obj1;
        Integer i2 = (Integer)obj2;
        if(i1 > i2)
            return 1;
        else if(i1 < i2)
            return -1;
        else
            return 0;
    }

}