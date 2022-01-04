import java.util.Scanner;

public class GroceryShop {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        double pearPerKg = 2.14;
        double applePerKg = 3.67;
        double tomatoPerKg = 1.11;
        double bananaPerKg = 0.95;
        double eggplantPerKg = 5;

        System.out.print("Kaç kilo armut aldınız? ");
        double pearAmount = input.nextDouble();
        System.out.print("Kaç kilo elma aldınız? ");
        double appleAmount = input.nextDouble();
        System.out.print("Kaç kilo domates aldınız? ");
        double tomatoAmount = input.nextDouble();
        System.out.print("Kaç kilo muz aldınız? ");
        double bananaAmount = input.nextDouble();
        System.out.print("Kaç kilo patlıcan aldınız? ");
        double eggplantAmount = input.nextDouble();

        double pearPrice = pearPerKg * pearAmount;
        double applePrice = applePerKg * appleAmount;
        double tomatoPrice = tomatoPerKg * tomatoAmount;
        double bananaPrice = bananaPerKg * bananaAmount;
        double eggplantPrice = eggplantPerKg * eggplantAmount;

        double totalSum = pearPrice + applePrice + tomatoPrice + bananaPrice + eggplantPrice;
        System.out.println("Toplam Tutar: " + totalSum);


    }
}
