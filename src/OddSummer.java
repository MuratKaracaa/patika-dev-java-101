import java.util.Scanner;

public class OddSummer {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int n = 0;
        int sum = 0;

        do {
            System.out.print("Sayı Girin: ");
            n = input.nextInt();
            if (n % 2 == 0 && n % 4 == 0){
                sum += n;
            }
        } while (n % 2 == 0);
        System.out.println(sum);

    }
}
