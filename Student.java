public class Student {
    String name;
    int rollno;
    int marks;
    void display(){
        System.out.println("Display name : "+ name);
    }
    public static void main(String[] args){
        Student X1 = new Student();
        X1.name = "Narendra";
        X1.rollno = 221;
        X1.marks = 98;
        Student X2 = new Student();
        X2.name = "Mallikarjun";
        X2.rollno = 289;
        X2.marks = 98;
        X1.display();
        X2.display();
    }
}
