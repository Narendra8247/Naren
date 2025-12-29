
public class Name {
    public static void main(String[] args) {

        String[] S1 = { "BrownBear", "Login HomePage", "Abort the test" };

        for (String testCase : S1) {
            String[] words = testCase.trim().split("\\s+");
            System.out.println("Testcase: \"" + testCase + "\" has " + words.length + " word(s)");
        }
    }
}
