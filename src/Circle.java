import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print( "Dairenin yarıçapını giriniz: " );
        double r = input.nextDouble();
        System.out.print( "Daire diliminin merkez açı ölçüsünü giriniz: " );
        double a = input.nextDouble();
        double area = (Math.PI * Math.pow( r , 2 ) * a) / 360 ;
        System.out.print("Daire dilimin alanı: " + area);
    }
}
