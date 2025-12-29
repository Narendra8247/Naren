public class StringMethods4 {
    public static void main(String[] args){
//        String s="Computer Science and Engineering";
//        System.out.println(s.contains("Engineering"));
//
        String s = "Java,Python,C++";
        String[] arr =s.split(",");
        for(String lang:arr){
            System.out.println(lang);
        }
    }
}
