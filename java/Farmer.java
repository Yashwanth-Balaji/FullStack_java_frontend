import java.util.Scanner;
class Information{
    double principle;
    int time;
    static double rate;
    double si;

    static{
        rate=2.5;
    }
    void collectionData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principle amt: ");
        principle=sc.nextDouble();
        System.out.println("Enter the time required in years= ");
        time=sc.nextInt();
    }

    void calculator(){
        si=(principle*time*rate)/100;
    }

    void showInterest(){
        System.out.println("Simple interest calculated is :"+si);
    }
}

public class Farmer{
    public static void main(String args[]){
        Information i1=new Information();
        Information i2=new Information();
        Information i3=new Information();

        i1.collectionData();
        i2.collectionData();
        i3.collectionData();

        i1.calculator();
        i2.calculator();
        i3.calculator();

        i1.showInterest();
        i2.showInterest();
        i3.showInterest();


    }
}