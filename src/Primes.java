import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.print("Limit Belirtin: ");
        int limit = input.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 2; i<limit; i++){
            boolean isPrime = true;
            for (int j = 2; j<i; j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                list.add( i );
            }
        }

        System.out.println(list);
    }
}
