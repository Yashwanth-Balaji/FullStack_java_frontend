class Cat{
    private String name;
    private String color;
    private int cost;
    private int age;
    private int breed;

    Cat(String n,String c,int co,int a,String b){
        this("Ramu","White",4000,4);
        name=n;
        color=c;
        cost=co;
        age=a;
        breed=b;
    }

    Cat(String n,String c,int co,int a){
        this("Trevor","Blue",7000);
        name=n;
        color=c;
        cost=co;
        age=a;
        
    }

    Cat(String n,String c,int co){
        this("Tipsy","Green");
        name=n;
        color=c;
        cost=co; 
    }

    Cat(String n,String c){
        this("Tipsy");
        name=n;
        color=c;
    }

    Cat(String n){
        this();
        name=n;
    }
    
    Cat(){
        super();
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public int getCost(){
        return cost;
    }

    public int getAge(){
        return age;
    }

    
}