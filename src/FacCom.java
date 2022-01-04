import java.util.Scanner;

public class FacCom {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.print("Küme Elemanı Sayısını Giriniz: ");
        int items = input.nextInt();

        System.out.print("Gruplandırılacak Eleman Sayısını Giriniz: ");
        int group = input.nextInt();

        long result = combination( items , group );
        System.out.println(result);
    }

    public static long factorial(int n){
        long result = 1;
        for (int i = 1; i<=n;i++){
            result *= i;
        }
        return result;
    }

    public static long combination(int n1, int n2){
        return factorial( n1 ) / (factorial( n2 ) * factorial( (n1 - n2) ));
    }
}
