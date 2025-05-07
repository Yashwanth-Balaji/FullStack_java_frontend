class StringActions{
    public static void main(String args[]){
        /*String s1=new String("Gtec");
        s1.concat("Jainx");
        String s2=s1.concat("Solutions");
        s1=s1.concat("soft");
        System.out.println(s1);
        System.out.println(s2);*/
        String s=new String("hello ");
        s.concat("world");
        System.out.println(s);

        StringBuffer s1=new StringBuffer("hello ");
        s1.append("world");
        System.out.println(s1);


        StringBuffer a1=new StringBuffer("hello");
        StringBuffer a2=new StringBuffer("hello");

        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));


        //String st="hello";
        System.out.println(s1.reverse());
    }
}