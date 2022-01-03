import java.util.Scanner;

public class VatCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print("Fiyatı giriniz: ");
        double price = input.nextDouble();
        if (price < 0){
            System.out.println("Geçersiz fiyat");
            System.exit( 1 );
        }
        double vat = price < 1000 ? price * 18 / 100 : price * 8 / 100;
        double priceWithVat = price + vat;
        System.out.println("KDV'siz Fiyat: " + price);
        System.out.println("KDV tutarı: " + vat);
        System.out.println("KDV'li Fiyat: " + priceWithVat);
    }
}
