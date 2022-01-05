import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.print("Sayı Giriniz: ");
        int inputNumber = input.nextInt();
        int sum = 0;

        for (int i = 1; i<inputNumber;i++){
            if (inputNumber % i == 0){
                sum += i ;
            }
        }

        boolean isPerfect = inputNumber == sum;
        String message = isPerfect ? "Mükemmel Sayıdır" : "Mükemmel Sayı Değildir";

        System.out.println(inputNumber + " " + message);
    }
}
