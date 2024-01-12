import java.util.Scanner;

public class Soru4 {
    public static void main (String[] args) {
//Soru4: Hesap Makinesi

        //Kullanıcıdan sayı girmesini iste

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen 1. Sayıyı Giriniz:");
        double sayi1 = scanner.nextDouble();
        System.out.print("Lütfen 2. Sayıyı Giriniz:");
        double sayi2 = scanner.nextDouble();

        System.out.print("Yapmak istediğiniz işlemi seçiniz(+,-,*,/):");
        char islem = scanner.next().charAt(0);
        double sonuc = 0;
        if (islem == '+') {
            sonuc=sayi1+sayi2;
        } else if (islem=='-') {
            sonuc=sayi1-sayi2;
        } else if (islem=='*') {
            sonuc=sayi1*sayi2;
        } else if (islem=='/') {
            if (sayi2 != 0){
                sonuc = sayi1 / sayi2;
            } else {
                System.out.println("Sıfıra bölünemez.");
                return;
            }
            } else {
                System.out.println("Geçersiz işlem seçimi.");
                return;
            }
            System.out.println("Sonuç:"+sonuc);
            scanner.close();
        }


    }



