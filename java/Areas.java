class Areas{
    public static void area_shape(double r){
        double area=3.14*r*r;
        System.out.println("Area of Circle is: "+area);
    }
    public static void area_shape(int a, int b){
        long area=a*b;
        System.out.println("Area of Rectangle is : "+area);
    }
    public static void area_shape(int a){
        int area=a*a;
        System.out.println("Area of Square is: "+area);
    }

    public static void main(String args[]){
        System.out.println("Areas of Circle, Rectangle and Sqaure");
        area_shape(5.5);
        area_shape(5,6);
        area_shape(5);
    }
}