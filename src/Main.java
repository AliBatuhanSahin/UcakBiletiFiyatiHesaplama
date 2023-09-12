import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe = 0, yas = 0, yTipi = 1;
        double tutar;
        double indirim = 0;


        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM türünden giriniz : ");
        mesafe = input.nextInt();
        tutar = mesafe * 0.10;

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk Tipini Giriniz(1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        yTipi = input.nextInt();

        if (mesafe <= 0) {
            System.out.println("Hatalı Giriş Ypatınız !");
        } else if (yas <= 0) {
            System.out.println("Hatalı Giriş Yaptınız !");
        } else if (yTipi != 1 && yTipi != 2) {
            System.out.println("Hatalı Giriş Yaptınız !");
        }
        if (yas < 12) {
            indirim = 0.50;
        } else if (yas >= 12 && yas <= 24) {
            indirim = 0.10;
        } else if (yas >= 65) {
            indirim = 0.30;
        }

        tutar -= tutar * indirim;

        if (yTipi == 2) {
            tutar -= tutar * 0.20;
            tutar *= 2;
        }

        System.out.println("Tutar : " + tutar);
    }
}