class StringExample{
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("hello ");
        System.out.println(sb.insert(1,"ey"));
        System.out.println(sb.delete(2,4));
        System.out.println(sb.replace(1,3,"i"));
        System.out.println("Modified : "+sb);
    }
}