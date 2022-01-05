import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        System.out.print("Satır Sayısını Girin: ");
        Scanner input = new Scanner( System.in );
        int lines = input.nextInt();
        int width = lines * 2 - 1;

        for (int i = width; i>=1;i-=2){
            String line = " ".repeat((width + 2  - i) / 2) + "*".repeat( i ) + " ".repeat((width + 2 - i) / 2);
            System.out.println(line);
        }
    }
}
