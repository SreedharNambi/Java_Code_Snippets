import java.util.*;

public class IsPalindromeString {
    public static boolean isPalindrome(String word){
        char[] charArr = word.toCharArray();
        int start = 0;
        int end = charArr.length-1;
        while(start < end){
            if(charArr[start] != charArr[end]){
                return false;
            }
            start++;
            end--;
        }   
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean result = isPalindrome(input);
        System.out.println(result);
        scanner.close();
    }
}
