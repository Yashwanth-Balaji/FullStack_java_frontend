class Queue {
    int data;
    boolean valueIsProduced = false;

    synchronized void put(int i) {
        while (valueIsProduced) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        data = i;
        System.out.println("Data added, value is: " + i);
        valueIsProduced = true;
        notify(); 
    }

    synchronized void get() {
        while (!valueIsProduced) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("The data value is: " + data);
        valueIsProduced = false;
        notify(); 
    }
}

class Producer extends Thread {
    Queue a;

    public Producer(Queue a) {
        this.a = a;
    }

    public void run() {
        int i = 0;
        while (true) {
            a.put(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread {
    Queue b;

    public Consumer(Queue b) {
        this.b = b;
    }

    public void run() {
        while (true) {
            b.get();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class ProducerConsumer {
    public static void main(String[] args) {
        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        p.start();
        c.start();
    }
}

/*
try{
    synchronized void put(int i){
        if(valueIsProduced == true){
            wait();
        }
        else{
            data = i;
            System.out.println("values");
            notify();
        }
    }

    synchronized void put(int i){
        if(valueIsProduced == false){
            wait();
        }
        else{
            data = i;
            System.out.println("values");
            notify();
        }
    }
}
*/
