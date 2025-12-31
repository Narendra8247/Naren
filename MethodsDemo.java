public class MethodsDemo {
//    int add(int a, int b){
//        int c = a+b;
//        return c;
//    }
    static int add(int a, int b) {
        return a +b;
    }
    static int add(int a ,int b, int c){
        return a+b+c;
    }
    static double add(double d1, double d2){
        return d1+d2;
    }
    public static void main(String[] args){
//        MethodsDemo obj = new MethodsDemo();
//        int result=obj.add(10,20);
//        System.out.println(result);



//        int result1=add(10,5);
//        System.out.println(result1);
//
//        int result2=add(5,10);
//        System.out.println(result2);

        int result1=add(10,5);
        System.out.println(result1);

        int result2=add(10,5,6);
        System.out.println(result2);

        int result3=add(14,5);
        System.out.println(result3);
    }
}
