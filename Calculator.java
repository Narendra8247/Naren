public class Calculator {
    public int Add(int a, int b){
        return a + b;
    }
    public int Sub(int a,int b){
        return a - b;
    }
    public int multiply(int a,int b){
        return a * b;
    }
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("Add: " + cal.Add(20,30));
        System.out.println("Sub: " + cal.Sub(50,20));
        System.out.println("mul: "+ cal.multiply(79,3));
    }
}
