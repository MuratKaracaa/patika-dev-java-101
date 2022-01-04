import java.util.Scanner;

public class ActivitySuggestion {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.print("Hava sıcaklığını giriniz: ");
        double heat = input.nextDouble();

        String activity = heat <= 5 ? "Kayak" :
                heat > 5 && heat < 15 ? "Sinema" :
                        heat > 15 && heat < 25 ? "Piknik" :
                                heat > 25 ? "Yüzme":
                                        null;

        System.out.print("Günlük aktivitemiz " + activity + "!");

    }
}
