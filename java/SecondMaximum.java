class SecondMaximum
{
    public static void main(String[] args)
    {
        int a[]={1,3,4,6,5,3};
        
        System.out.println(secondMin(a));
        
        //System.out.println(min);
    }
    public static int secondMin(int a[])
    {
        int fmin=a[0];
        for(int i=0; i<a.length; i++)
        {
            if(fmin>a[i])
            {
                fmin=a[i];
            }
        }
        int r=0;
        int count=1;
        System.out.println(fmin);
        int min=-1;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(fmin+count==a[j])
                {
                    //System.out.println(a[j]);
                    r=a[j];
                    return r;
                }
                
            }
            count++;
        }
        return r;
    }
}