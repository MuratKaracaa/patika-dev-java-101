import java.util.Arrays;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome( 123432 ));
    }

    public static boolean isPalindrome(int n1){
        boolean result = false;
        List<String> split =  Arrays.stream( String.valueOf( n1 ).split( "" ) ).toList();
        int length = split.size();
        if (length % 2 == 0) return false;

        for (int i = 0; i<(length + 1) / 2; i++){
            if (split.get( i ) == split.get( length - 1 - i )) result = true;
        }
        return result;
    }
}
