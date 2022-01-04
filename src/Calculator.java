import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.print( "ilk sayıyı girin: " );
        double n1 = input.nextDouble();
        System.out.print( "ikinci sayıyı girin: " );
        double n2 = input.nextDouble();

        System.out.println("İşlem Numarasını Girin:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        int p = input.nextInt();

        switch (p){
            case 1:
                System.out.println("İşlem Sonucunuz: " + (n1 + n2));
                break;
            case 2:
                System.out.println("İşlem Sonucunuz: " + (n1 - n2));
                break;
            case 3:
                System.out.println("İşlem Sonucunuz: " + (n1 * n2));
                break;
            case 4:
                System.out.println("İşlem Sonucunuz: " + (n1 / n2));
                break;
        }
    }
}
