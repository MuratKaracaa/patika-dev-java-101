import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print( "Boyunuzu giriniz: " );
        double h = input.nextDouble();
        System.out.print( "Kilonuzu giriniz: " );
        double w = input.nextDouble();
        double BMI = w / Math.pow( h,2 );
        System.out.println("Vücut Kitle Endeksiniz: " + BMI);

    }
}
