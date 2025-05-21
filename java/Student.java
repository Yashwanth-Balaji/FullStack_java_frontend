class StudentInfo{
    private String name;
    private int id;
    private double phno;
    private String course;
    private String loc;
    private int m1;
    private int m2;
    private int m3;

   /* Student(String n, int i, int p, String c, int m1, int m2, int m3){
        this.name = n;
        this.id = i;
        this.phno = p;
        this.course = c;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }*/

   //Setters
   public void setName(String name){
    this.name=name;
   }
   public void setId(int id){
    this.id=id;
   }
   public void setphno(double phno){
    this.phno=phno;
   }
   public void setLoc(String loc){
    this.loc=loc;
   }
    public void setCourse(String course){
        this.course=course;
    }
    public void setM1(int m1){
        this.m1=m1;
    }
    public void setM2(int m2){
        this.m2=m2;
    }
    public void setM3(int m3){
        this.m3=m3;
    }


    //Getters

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getPhno(){
        return phno;
    }
    public String getLoc(){
        return loc;
    }
    public String getCourse(){
        return course;
    }
    public int getM1(){
        return m1;
    }
    public int getM2(){
        return m2;
    }
    public int getM3(){
        return m3;
    }

    public int getTotal(){
        return m1+m2+m3;
    }

    public double getAvg(){
        return (m1+m2+m3)/3;
    }
    public String getGrade(){
        double avg = getAvg();
        if(avg>=90){
            return "A+";
        }
        else if(avg>=80){
            return "A";
        }
        else if(avg>=70){
            return "B+";
        }
        else if(avg>=60){
            return "B";
        }
        else if(avg>=50){
            return "C+";
        }
        else if(avg>=40){
            return "C";
        }
        else{
            return "F";
        }
    }

}

public class Student{
    public static void main(String args[]){
        StudentInfo s1 = new StudentInfo();
        s1.setName("Anil");
        s1.setId(101);
        s1.setphno(9848031);
        s1.setLoc("Bangalore");
        s1.setCourse("Computer Science");
        s1.setM1(85);
        s1.setM2(90);
        s1.setM3(78);

        System.out.println("Name: " + s1.getName());
        System.out.println("ID: " + s1.getId());
        System.out.println("Phone Number: " + s1.getPhno());
        System.out.println("Location: " + s1.getLoc());
        System.out.println("Course: " + s1.getCourse());
        System.out.println("Marks 1: " + s1.getM1());
        System.out.println("Marks 2: " + s1.getM2());
        System.out.println("Marks 3: " + s1.getM3());
        System.out.println("Total Marks: " + s1.getTotal());
        System.out.println("Average Marks: " + s1.getAvg());
        System.out.println("Grade: " + s1.getGrade());
    }
}