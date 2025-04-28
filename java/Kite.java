class Kite{
public static void main(String args[]){
for(int i=1;i<=5;i++){
for(int j=i;j<=5;j++){
System.out.print(" ");
}
for(int k=1;k<=i*2-1;k++){
System.out.print("*");
}
System.out.println();
}
for(int x=5;x>=1;x--){
for(int y=4;y>=x;y--)
System.out.print("*");
System.out.println();
}
}
}