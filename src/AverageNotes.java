import java.util.Scanner;

public class AverageNotes {
    public static void main(String[] args) {
        int math, phys, chem, tur, hist, mus;
        Scanner input = new Scanner( System.in );

        System.out.print( "Input math score: " );
        math = input.nextInt();

        System.out.print( "Input phys score: " );
        phys = input.nextInt();

        System.out.print( "Input chem score: " );
        chem = input.nextInt();

        System.out.print( "Input tur score: " );
        tur = input.nextInt();

        System.out.print( "Input hist score: " );
        hist = input.nextInt();

        System.out.print( "Input mus score: " );
        mus = input.nextInt();

        double avg = ( math + phys + chem + tur + hist + mus ) / 6;

        System.out.println( avg );

        String passStatus = avg > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println( passStatus );

    }
}


