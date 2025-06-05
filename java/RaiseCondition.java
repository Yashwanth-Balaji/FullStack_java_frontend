/*class Word extends Thread{
    public void typing(){
        for(int i=0;i<=5;i++){
            try{
                System.out.println("typing the content");
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public void spellCheck(){
        for(int i=0;i<=5;i++){
            try{
                System.out.println("Checking the spellings");
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public void saving(){
        for(int i=0;i<=5;i++){
            try{
                System.out.println("Saving the file ");
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public void run(){
        String taskName = Thread.currentThread().getName();
        if (taskName.equals("typing")) {
            typing();
        } else if (taskName.equals("spellCheck")) {
            spellCheck();
        } else {
            saving();
        }
    }
}
public class RaiseCondition {
    public static void main(String[] args) {
        Word w1 = new Word();
        Word w2 = new Word();
        Word w3 = new Word();

        w1.setName("typing");
        w2.setName("spellCheck");
        w3.setName("saving");

        w1.start();
        w2.start();
        w3.start();
    }
}
*/


class Word extends Thread{
    public void typing(){
        for(int i=0;i<=5;i++){
            try{
                System.out.println("typing the content");
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public void spellCheck(){
        for(;;){
            try{
                System.out.println("Checking the spellings");
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public void saving(){
        for(;;){
            try{
                System.out.println("Saving the file ");
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public void run(){
        String taskName = Thread.currentThread().getName();
        if (taskName.equals("typing")) {
            typing();
        } else if (taskName.equals("spellCheck")) {
            spellCheck();
        } else {
            saving();
        }
    }
}
public class RaiseCondition {
    public static void main(String[] args) {
        Word w1 = new Word();
        Word w2 = new Word();
        Word w3 = new Word();

        w1.setName("typing");
        w2.setName("spellCheck");
        w3.setName("saving");

        w2.setDaemon(true);
        w2.setPriority(8);

        w3.setDaemon(true);
        w3.setPriority(9);

        w1.start();
        w2.start();
        w3.start();
    }
}
