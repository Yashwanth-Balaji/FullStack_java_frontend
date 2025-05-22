class Bank{
    int getInterestRate(){
        return 9;
    }
}
class YesBank extends Bank{
    int getInterestRate(){
        return 8;
    }
}
class SBI extends Bank{
    int getInterestRate(){
        return 10;
    }
}
class Banking{
    public static void main(String args[]){
        SBI s=new SBI();
        System.out.println(s.getInterestRate());
    }
}