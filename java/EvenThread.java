/*class Number extends Thread{
    public void run(){
        if(Thread.currentThread().getName().equals("even")){
            even();
        }
        else{
            odd();
        }
    }
    public void even(){
        for(int i =0;i<=10;i++){
            if(i % 2 == 0)
                System.out.println(i);
        }
    }
    public void odd(){
        for(int i =0;i<=10;i++){
            if(i % 2 != 0)
                System.out.println(i);
        }
    }
}
public class EvenThread {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();

        n1.setName("even");
        n2.setName("odd");

        n1.start();
        n2.start();
    }


    PS D:\Jainx\java> javac EvenThread.java
PS D:\Jainx\java> java EvenThread
0
2
4
6
8
10
1
3
1
3
3
9
}*/

class Number implements Runnable{
    @Override
    public void run(){
        if(Thread.currentThread().getName().equals("even")){
            even();
        }
        else{
            odd();
        }
    }
    public void even(){
        for(int i =0;i<=10;i++){
            if(i % 2 == 0)
                System.out.println(i);
        }
    }
    public void odd(){
        for(int i =0;i<=10;i++){
            if(i % 2 != 0)
                System.out.println(i);
        }
    }
}
public class EvenThread {
    public static void main(String[] args) {
        Number t1 = new Number();
        Number t2 = new Number();

        Thread n1 = new Thread(t1);
        Thread n2 = new Thread(t2);

        n1.setName("even");
        n2.setName("odd");

        n1.start();
        n2.start();
    }
}
/*

PS D:\Jainx\java> javac EvenThread.java
PS D:\Jainx\java> java EvenThread      
0
2
1
3
5
7
9
4
6
8
10
PS D:\Jainx\java>
*/