import java.util.Arrays;
import java.util.Scanner;

public class PassTheClass {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.print("Matematik notunuzu girin: ");
        double mathGrade = input.nextDouble();

        System.out.print("Fizik notunuzu girin: ");
        double physGrade = input.nextDouble();

        System.out.print("Türkçe notunuzu girin: ");
        double turGrade = input.nextDouble();

        System.out.print("Kimya notunuzu girin: ");
        double chemGrade = input.nextDouble();

        System.out.print("Müzik notunuzu girin: ");
        double musGrade = input.nextDouble();

        double[] grades = {mathGrade , physGrade , turGrade , chemGrade , musGrade};

        for (int i = 0; i<grades.length;i++){
            if (!(grades[i] > 0 && grades[i] < 100)){
                grades[i] = 0;
            }
        }


        boolean pass = Arrays.stream( grades ).sum() / grades.length >= 55;
        if (pass){
            System.out.print("Tebrikler, sınıfı geçtiniz!");
        } else {
            System.out.print("Sınıfta kaldınız, seneye tekrar görüşmek üzere");
        }
    }
}
