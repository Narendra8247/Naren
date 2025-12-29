public class Sum {
    public static void main(String[] args){
        int x = 1234;
        int y = 0;
        while(x != 0){
            int z = x%10;
             y = y+z;
             x = x/10;
        }
        System.out.println(y);
    }
}
