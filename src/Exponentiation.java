import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        int result = 1;

        System.out.print("Taban sayıyı girin: ");
        int base = input.nextInt();

        System.out.print("Kuvveti girin: ");
        int power = input.nextInt();

        for (int i = 1; i<=power;i++){
            result *= base;
        }
        System.out.print("Sonucunuz: " + result);
    }
}
