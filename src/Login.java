import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        String username = "testuser" , password = "testpassword";

        System.out.print("Kullanıcı adınızı girin: ");
        String inputUserName = input.nextLine();

        System.out.print("Şifrenizi girin: ");
        String inputPassword = input.nextLine();


        boolean correctCredentials = username.equals( inputUserName ) && password.equals( inputPassword );
        if (correctCredentials){
            System.out.print("Bilgiler doğru, giriş yapılıyor...");
        } else if (password != inputPassword) {
            System.out.println("Şifre hatalı, şifrenizi sıfırlamak istermisiniz?\n1-Evet\n2-Hayır");
            int answer =  input.nextInt();
            switch (answer){
                case 1:
                    System.out.print("Yeni şifrenizi girin: ");
                    String inputNewPassword = input.nextLine();
                    input.nextLine();
                    System.out.println(inputNewPassword);
                   if (inputNewPassword == password){
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.print("Şifre oluşturuldu.");
                        password = inputNewPassword;
                    }
                break;
                case 2:
                    System.exit( 1 );
                    break;
            }
        }
    }
}
