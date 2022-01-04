import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.print("1. Sayı: ");
        double n1 = input.nextDouble();

        System.out.print("2. Sayı: ");
        double n2 = input.nextDouble();

        System.out.print("3. Sayı: ");
        double n3 = input.nextDouble();

        double[] array = {n1, n2, n3};

        if(n1<n2 && n1<n3){
            if(n2<n3){
                System.out.println("a < b < c");
            }
            else{
                System.out.println("a < c < b");
            }
        }
        else if(n2<n1 && n2<n3){
            if(n1<n3){
                System.out.println("b < a < c");
            }
            else{
                System.out.println("b < c < a");
            }
        }
        else if(n3<n1 && n3<n2){
            if(n1<n2){
                System.out.println("c < a < b");
            }
            else{
                System.out.println("c < b < a");
            }
        }
    }
}
