class Department{
    int deptId;
    String deptName;
    Department(int id,String name){
        this.deptId = id;
        this.deptName = name;
    }
    public void display(){
        System.out.println("Your department Id is : "+deptId);
        System.out.println("Your department name is : "+deptName);
    }
}
class Student implements Cloneable{
    String name;
    int regNo;
    Department d;
    Student(String name,int regNo,Department d){
        this.name=name;
        this.regNo=regNo;
        this.d = d;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Register Number : "+regNo);
        d.display();
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class ObjCloning{
    public static void main(String args[]) throws CloneNotSupportedException{
        Department d = new Department(1,"cse");
        Student s = new Student("Kabelesh",1064,d);
        Student s2 = (Student)s.clone();

        s.display();
        s2.display();
    }
}