class ThreadCode1{
    public static void main(String args[]){
        Thread t = new Thread();
        System.out.println(t);
        t.setName("Gtec");
        t.setPriority(3);
        System.out.println(t);
        test();
    }
    public static void test(){
        Thread t = new Thread();
        System.out.println(t);
    }
}