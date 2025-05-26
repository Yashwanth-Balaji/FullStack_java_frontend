import java.util.Scanner;
public class Exception_Index {
    public static void main(String args[]){
        // int ar[]={1,2,3,4};
        // try{
        //     for(int i=0;i<=5;i++)
        //         System.out.println(ar[i]);
        // }
        // catch(Exception e){
        //     e.printStackTrace();
        // }
        // finally{
        //     System.out.println("Code Executed Successfully");
        // }



     
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String s = sc.nextLine();

        try {
            // Check if user entered nothing
            if (s.isEmpty()) {
                throw new IllegalArgumentException("Input string is empty.");
            }

            System.out.println("Length of string: " + s.length());
            System.out.println("Uppercase: " + s.toUpperCase());

        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught an Exception: " + e.getMessage());
        } finally {
            System.out.println("Code Executed Successfully");
        }

        sc.close();
    }
}
