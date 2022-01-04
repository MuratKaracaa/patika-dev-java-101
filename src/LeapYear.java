import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.print("Yıl giriniz: ");
        int year = input.nextInt();
        boolean fourYear = year % 4 == 0;
        boolean hundredYear = year % 100 == 0;
        boolean fourHundredYear = year % 400 == 0;
        boolean isLeapYear = true;

        if (fourYear){
            if (hundredYear && !fourHundredYear){
                isLeapYear = false;
            }
        } else {
            isLeapYear = false;
        }
        String message = isLeapYear ? year + " bir artık yıldır." : year + " bir artık yıl değildir.";
        System.out.print(message);
    }
}
