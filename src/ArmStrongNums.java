import java.util.Scanner;

public class ArmStrongNums {
    public static void main(String[] args) {
        // Verilen sayının basamaklarını toplayan program
        Scanner input = new Scanner( System.in );

        System.out.print("Sayıyı girin: ");
        int inputNum = input.nextInt();
        String[] stringNum = String.valueOf( inputNum ).split( "" );
        int result = 0;
        for (int i = 0; i<stringNum.length;i++){
            result += Integer.parseInt( stringNum[i] );
        }
        System.out.println(result);
    }
}
