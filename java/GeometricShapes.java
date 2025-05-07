class GeometricShapes{
    public static void main(String argds[]){
        GeometricShapes g=new GeometricShapes();
        g.shape(10);
        g.shape(10.5);
    }
    void shape(int a){
        System.out.println("This is Rectangle");
    }
    int shape(double d){
        System.out.println("This is Square ");
        return 0;
    }

    
}