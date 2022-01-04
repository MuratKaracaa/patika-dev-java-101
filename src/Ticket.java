import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        double perKm = 0.10;

        System.out.print("Mesafeyi KM türünden giriniz: ");
        double distance = input.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        double age = input.nextDouble();

        System.out.println("Yolculuk Tipini Giriniz:\n1-Tek Yön\n2-Gidiş Dönüş");
        double type = input.nextDouble();

        if (!(distance > 0) || !(age > 0) || !(type != 1 || type != 2)){
            System.out.print("Hatalı Veri Girdiniz!");
            System.exit( 1 );
        }
        double price = perKm * distance;
        if (age < 12){
            if (type == 2){
                price *= 0.5 * 0.8 * 2;
            } else {
                price *= 0.5;
            }
        } else if (age > 12 && age < 24) {
            if (type == 2){
                price *= 0.9 * 0.8 * 2;
            } else {
                price *= 0.9;
            }
        } else if (age > 65){
            if (type == 2){
                price *= 0.7 * 0.8 * 2;
            } else {
                price *= 0.7;
            }
        }

        System.out.print("Bilet Fiyatı: " + price);
    }
}
