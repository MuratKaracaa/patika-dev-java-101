import java.util.Arrays;
import java.util.Scanner;

public class EvenFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print("Lütfen sayı giriniz: ");
        int num = input.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 1; i<num; i++){
            if (i % 3 == 0 || i % 4 == 0){
                sum += i;
                count ++;
            }
        }
        System.out.print(sum/count);
    }
}
