import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print("Üçgen Satırı Uzunluğunu Girin: ");
        int lines = input.nextInt();
        int width = lines * 2 - 1;
        for (int i = 1; i<=width;i+=2){
            String line = " ".repeat((width - i) / 2) + "*".repeat( i ) + " ".repeat((width - i) / 2);
            System.out.println(line);
        }

        int secondWidth =width - 2;
        for (int i = secondWidth; i>=1;i-=2){
            String line = " ".repeat((secondWidth + 2  - i) / 2) + "*".repeat( i ) + " ".repeat((secondWidth + 2 - i) / 2);
            System.out.println(line);
        }
    }
}
