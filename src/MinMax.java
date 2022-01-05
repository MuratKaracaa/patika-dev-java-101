import java.util.*;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner( System.in );

        System.out.print("Kaç adet sayı gireceksiniz?: ");
        int count = input.nextInt();

        for (int i = 1; i<=count;i++){
            System.out.print(i + ". Sayıyı Girin: ");
            int inputNum = input.nextInt();
            list.add( inputNum );
        }

        int min = Collections.min( list );
        int max = Collections.max( list );
        System.out.print("En Büyük Sayı: " + max + "\nEn Küçük Sayı: " + min );
    }
}
