import java.util.Scanner;
public class soru2 {
    public static void main(String[] args) {
//Soru2: Tutara göre KDV oranı Hesaplama

        //kullanıcıdan para değerini al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen para değerini girin:");
        double kdvSizFiyat = scanner.nextDouble();

        //KDV oranı
        double kdvOrani;
        if (kdvSizFiyat >= 0 && kdvSizFiyat <= 1000) {
            kdvOrani = 0.10;
        } else {
            kdvOrani = 0.22;
        }
        //KDV Hesaplama

        double kdvTutari = kdvSizFiyat * kdvOrani;
        double toplamTutar = kdvSizFiyat  + kdvTutari;
            System.out.println("Girilen Tutar:"+kdvSizFiyat);
            System.out.println("KDV Oranı: %" + (kdvOrani*100));
            System.out.println("KDV Tutarı:" + kdvTutari);
            System.out.println("Toplam Tutar:"+toplamTutar);
    }
}