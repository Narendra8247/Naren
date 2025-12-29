public class Longest {
    public static void main(String[] args) {
        String[] Long={"Login","VerifyHomepage","Logout"};
        String longest = Long[0];
        for (int i =0; i< Long.length; i++){
            if(longest.length()<Long[i].length()){
                longest=Long[i];
            }
            else{
                longest=longest;
            }
        }
        System.out.println("longest: "+longest);
    }
}