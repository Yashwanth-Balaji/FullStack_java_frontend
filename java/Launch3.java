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
class Three extends Two{
    public void print_geek(){
        System.out.println("Three");
    }
}
class Launch3{
    public static void main(String args[]){
        Three t=new Three();
        t.print_geek();
        t.print_for();
        t.print_geek();
    }
}