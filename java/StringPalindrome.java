import java.util.Scanner;
class StringPalindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        /*StringBuffer sb=new StringBuffer();
        String s=sc.nextLine();
        sb.append(s);

        StringBuffer sb1=new StringBuffer();
        sb1.append(sb.reverse());

        if(sb.toString().equals(sb1.toString()))
            System.out.println("Palindrome String");
        else
            System.out.println("Not Palindrome string");*/

         String s1 = sc.nextLine();
        String s2 = "";
        
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);  // Append characters in reverse order
        }

        System.out.println(s2);
        
        if (s1.equals(s2))
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");
    }
}