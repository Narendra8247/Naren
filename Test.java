public class Test{
    public static void main(String[] args) {
        String [] status = {"Pass","Fail","Pass","Fail","Pass","Pass"};
        int passCount = 0;
        int failCount = 0;
        for (int i = 0; i < status.length; i++){
            if(status[i].equals("Pass")){
                passCount++;
            } else {
                failCount++;
            }
        }
        System.out.println("No of Pass: " + passCount);
        System.out.println("No of Fail: " + failCount);
    }
}