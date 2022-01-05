import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.print("Birinci Sayıyı Girin: ");
        int n1 = input.nextInt();

        System.out.print("İkinci Sayıyı Girin: ");
        int n2 = input.nextInt();

        int ebob = getEbob( n1 , n2 );
        int ekok = n1 * n2 / ebob;
        System.out.println("Sayıların Ebobu : " + ebob + "\nSayıların Ekoku : " + ekok);
    }

    public static int getEbob(int n1, int n2){
        int smallerNumber = n1 > n2 ? n2 : n1;
        int result = 1;
        while(smallerNumber > 1){
            if (n1 % smallerNumber == 0 && n2 % smallerNumber == 0){
                result = smallerNumber;
                break;
            }
            smallerNumber--;
        }
        return result;
    }

}
