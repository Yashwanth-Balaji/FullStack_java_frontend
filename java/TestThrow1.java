import java.io.*;
class TestThrow1{
    //void m() throws IOException{
    void m(){
        int res=60/0;
    }

    //void n() throws IOException{
    void n(){
        m();
    }
    //void p() throws IOException{
    void p(){
        try{
            n();
        }
        catch(Exception e){
            System.out.println("Exception Handled ");
        }
    }
    public static void main(String[] args) {
        TestThrow1 t = new TestThrow1();
        try {
            t.p();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

