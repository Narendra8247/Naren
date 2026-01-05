public class Student1 {
    String name;
//    int age;
    int rollno;
    Student1(String n, int a){
        name=n;
//        age=a;
        rollno=a;
    }
    void display() {
        int marks=90;
        System.out.println(name+" "+marks+" "+rollno);
    }
    public static void main(String[] args){
        Student1 obj=new Student1("Narendra",221);
        obj.display();
//        System.out.println(obj.name+" "+obj.age);
//        System.out.println(obj.+" "+obj.rollno);
    }
}
