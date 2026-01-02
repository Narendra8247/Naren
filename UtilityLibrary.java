import java.util.Arrays;
public class UtilityLibrary {
    static int power(int a, int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result = result +b;
        }
        return result;
    }
    static int factorial(int n){
        int fact =1;
        for(int i =1;i<=n;i++){
            fact = fact *i;
        }
        return fact;
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        return true;
    }
    static int gcd(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
    static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    static boolean palindrome(String s) {
        String rev = reverse(s);
        if (s.equals(rev))
            return true;
        else
            return false;
    }static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                count++;
        }
        return count;
    }

    static String removeDuplicates(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }
        return result;
    }
    static void sortArray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static int search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    static int findMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    static int findMin(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    static void reverseArray(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        System.out.println("Power: " + power(2, 4));
        System.out.println("Factorial: " + factorial(5));
        System.out.println("Is Prime (7): " + isPrime(7));
        System.out.println("GCD: " + gcd(24, 36));

        String s = "programming";
        System.out.println("\nReverse: " + reverse(s));
        System.out.println("Palindrome (madam): " + palindrome("madam"));
        System.out.println("Vowel Count: " + countVowels(s));
        System.out.println("Remove Duplicates: " + removeDuplicates(s));

        int arr[] = {5, 2, 9, 1, 6};

        System.out.println("\nOriginal Array: " + Arrays.toString(arr));
        sortArray(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Search 9 index: " + search(arr, 9));
        System.out.println("Max Element: " + findMax(arr));
        System.out.println("Min Element: " + findMin(arr));
        reverseArray(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
