import java.util.Scanner;
import java.math.*;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print("1. Kenarı girin: ");
        double s1 = input.nextDouble();
        System.out.print("2. Kenarı girin: ");
        double s2 = input.nextDouble();
        System.out.print("3. Kenarı girin: ");
        double s3 = input.nextDouble();
        double u = (s1 + s2 + s3) / 2;
        double area = Math.sqrt( u * ( u - s1) * (u-s2) * (u-s3) );
        System.out.println("Girmiş olduğunuz üçgenin alanı: " + area);

    }
}
