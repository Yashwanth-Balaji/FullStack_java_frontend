class Warrior extends Thread{
    String res1 = "AK47";
    String res2 = "M762";
    String res3 = "Kar98k";

    public void run(){
        if(Thread.currentThread().getName().equals("soldier1")){
            soldierAcq1();
        }
        else{
            soldierAcq2();
        }
    }

    public void soldierAcq1(){
        try{
            synchronized(res1){
                System.out.println("Soldier1 acquries the resource1 "+res1);
                Thread.sleep(4000);
                synchronized(res2){
                    System.out.println("Soldier1 acquries the resource2 "+res2);
                    Thread.sleep(4000);
                    synchronized(res3){
                        System.out.println("Soldier1 acquries the resource3 "+res3);
                        Thread.sleep(4000);
                    }
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void soldierAcq2(){
        try{
            synchronized(res1){
                System.out.println("Soldier2 acquries the resource1 "+res1);
                Thread.sleep(4000);
                synchronized(res2){
                    System.out.println("Soldier2 acquries the resource2 "+res2);
                    Thread.sleep(4000);
                    synchronized(res3){
                        System.out.println("Soldier2 acquries the resource3 "+res3);
                        Thread.sleep(4000);
                    }
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class Acquisition {
    public static void main(String[] args) {
        Warrior w1 = new Warrior();
        Warrior w2 = new Warrior();


        w1.setName("soldier1");
        w2.setName("soldier2");

        w1.start();
        w2.start();
    }
    
}
