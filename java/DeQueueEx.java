import java.util.ArrayDeque;

public class DeQueueEx {
    public static void main(String args[]){
        ArrayDeque <Object> ad = new ArrayDeque<>();
        System.out.println(ad);
        ad.add(23);
        ad.add(134);
        System.out.println(ad);
        ad.add("Bhavana");
        ad.add("Poojitha");
        ad.add("Theju");
        System.out.println(ad);

    }
}
