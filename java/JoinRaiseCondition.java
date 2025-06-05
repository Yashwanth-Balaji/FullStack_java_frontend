class Human extends Thread{
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+" has entered the restroom");
            Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            System.out.println(Thread.currentThread().getName()+" is using the restroom");
            Thread.sleep(3000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            System.out.println(Thread.currentThread().getName()+" has left the restroom");
            Thread.sleep(4000);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class JoinRaiseCondition {
    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human();
        Human h3 = new Human();

        h1.setName("Gowtham");
        h2.setName("Charan");
        h3.setName("Girl");

        try{
            h1.start();
            h1.join();
            h2.start();
            h2.join();
            h3.start();
            h3.join();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
