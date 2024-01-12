import java.util.Scanner;
public class Soru1 {
    public static void main(String[] args) {
//Soru 1: KDV Hesaplama

        //kullanıcıdan para değerini al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen para değerini girin:");
        double kdvSizFiyat = scanner.nextDouble();

        //KDV oranı
        double kdvOrani = 0.30;

        //KDVli fiyat ve KDV oranını hesapla
        double kdvliFiyat = kdvSizFiyat * (1 + kdvOrani);
        double kdvTutari = kdvliFiyat - kdvSizFiyat;

        //Sonucu ekrana yazdır
        System.out.println("KDV'siz Fiyat:" + kdvSizFiyat);
        System.out.println("KDV'li Fiyat:" + kdvliFiyat);
        System.out.println("KDV Tutarı:" + kdvTutari);
        scanner.close();
    }
}
