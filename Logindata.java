public class Logindata {
    private String username;
    private String password;

    public void setUsername(String user) {
        username = user;
    }

    public String setUsernames() {
        return username;
    }

    public static void main(String[] args) {
        Logindata X1 = new Logindata();
        X1.setUsername("Narendra");
        System.out.println(X1.setUsernames());
    }
}