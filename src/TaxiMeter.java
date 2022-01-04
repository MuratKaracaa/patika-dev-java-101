import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {
        double perKm = 2.20;
        double openingFee = 10;
        Scanner input = new Scanner( System.in );
        System.out.print( "Mesafeyi giriniz: " );
        double distance = input.nextDouble();
        double feePerDistance = distance * perKm;
        double taxiFee = openingFee + feePerDistance < 20 ? 20: openingFee + feePerDistance;
        System.out.println("Taksimetre ücreti:" + taxiFee);
    }
}
