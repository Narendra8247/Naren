public class Number {
    public static void main (String[] args){
        String[] S1= {"Test01_abort", "Login", "Homepage", "Testcase_02"};
        for (String word : S1) {
            if(word.matches(".*\\d.*")){
                System.out.println(word);
            }
        }
    }
}
