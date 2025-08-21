import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;
public class MapExample {
    public static void main(String[] args) {
        /*Map<Integer,String> map = new HashMap<>();
        map.put(104,"Anil");
        map.put(101,"Girish");
        map.put(102,"Ganesh");
        map.put(103,"Lakshmi");
        map.put(105,"null");
        map.put(null, "null");
        map.put( 106,"null");
        System.out.println(map);
        */

        /*Map<Integer,String> map = new LinkedHashMap<>();
        map.put(104,"Anil");
        map.put(101,"Girish");
        map.put(102,"Ganesh");
        map.put(103,"Lakshmi");
        map.put(105,"null");
        map.put(null, "null");
        map.put( 106,"null");
        System.out.println(map);

        */
        Map<Integer,String> map = new TreeMap<>();
        map.put(104,"Anil");
        map.put(101,"Girish");
        map.put(102,"Ganesh");
        map.put(103,"Lakshmi");
        map.put(105,"null");
        map.put(107, "null");
        map.put( 106,"null");
        System.out.println(map);
        
        
        
    }
}
