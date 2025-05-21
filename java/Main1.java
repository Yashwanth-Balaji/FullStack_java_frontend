class One{
    public void print_geek(){
        System.out.println("One");
    }
}
class Two extends One{
    public void print_for(){
        System.out.println("Two");
    }
}
class Main1{
    public static void main(String args[]){
        Two t=new Two();
        t.print_geek();
        t.print_for();
    }
}