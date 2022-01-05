import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int remaining = 3;
        int balance = 1500;

        while (remaining > 0){
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();

            System.out.print("Parolanız : ");
            password = input.nextLine();

            int select;

            boolean authenticatedUser = userName.equals( "patika" ) && password.equals( "dev123" );

            if (authenticatedUser){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz...");
                do {
                    System.out.print("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yap\n");
                    System.out.print("Yapmak istediğiniz işlemi seçin: ");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktarı seçin: ");
                            int amount = input.nextInt();
                            balance += amount;
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktarı seçin: ");
                            int draw = input.nextInt();
                            boolean validDraw = draw <= balance;
                            if(!validDraw){
                                System.out.println("Bakiye Yetersiz"); System.exit( 1 );
                            } else {
                                balance -= draw;
                                System.out.println("Kalan Bakiye: " + balance);
                            }

                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere");
                break;
            } else {
                remaining--;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre, Lütfen Daha Sonra Tekrar Deneyin");

            } if (remaining == 0) System.out.println("Hesabınız Bloke Edilmiştir. Bankayla İrtibata Geçin");
            System.out.println("Kalan Hakkınız: " + remaining);
        }
    }
}
