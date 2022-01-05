import java.util.*;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.print("Kaç adet sayı gireceksiniz?: ");
        int count = input.nextInt();

        int min = 0;
        int max = 0;

        for (int i = 1; i<=count;i++){
            System.out.print(i + ". Sayıyı Girin: ");
            int inputNum = input.nextInt();
            min = i == 1 ? inputNum : inputNum < min ? inputNum : min;
            max = i == 1 ? inputNum : inputNum > max ? inputNum : max;
        }

        System.out.print("En Büyük Sayı: " + max + "\nEn Küçük Sayı: " + min );
    }
}
