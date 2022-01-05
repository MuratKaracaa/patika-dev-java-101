import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print("Test Edilecek Sayıyı Girin: ");
        int inputNum = input.nextInt();
        System.out.println(isPalindrome( inputNum ));
    }

    public static boolean isPalindrome(int n1){
        boolean result = false;
        List<String> split =  new ArrayList<>(Arrays.asList( String.valueOf( n1 ).split( "" ) ));
        int length = split.size();

        if (length % 2 == 0){
            List<String> first = split.subList( 0 , length / 2 );
            List<String> second = split.subList( length / 2 , length  );
            Collections.reverse( second );
            result = first.equals( second ) ? true : false;
        } else {

            for (int i = 0; i<length / 2; i++){

                if (!(split.get( i )).equals( split.get( length - 1 - i ) ))break;
                else result = true;
            }
        }
        return result;
    }
}
