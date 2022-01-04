import java.util.Scanner;

public class PowerFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.print("Sayı girin: ");
        int num = input.nextInt();
        int i = 1;

        while (num > Math.pow( 4,i ) && num > Math.pow( 5,i )){
            System.out.print(Math.pow( 4,i ) + " " + Math.pow( 5,i ) + "\n");
            i++;
        }

    }
}
