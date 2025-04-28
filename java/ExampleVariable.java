class ExampleVariable{
static int count;   // even it is not initialised, the default value is 0. This will be applicable for //both the instance and static variables
int id;
public void show(){
//int temp=5;
int temp;  //using this we cannot print the output as the local variable needs to be initialised by //the user or the person who writes the code
//System.out.println(temp);
}
public static void main(String args[]){
ExampleVariable obj=new ExampleVariable();
ExampleVariable obj1=new ExampleVariable();
obj.id=101;
//obj1.id=102;
System.out.println(obj1.id);   //0
obj.count++;
obj.show();   //5
System.out.println(obj.id);//101
obj.id++;
System.out.println(obj.id);//102
int c=ExampleVariable.count;
System.out.println(c);  //1
//System.out.println(ExampleVariable.count);
obj1.count++; 
System.out.println(obj1.count);  //2
obj1.id++;
System.out.println(obj1.id);   //103
}
}