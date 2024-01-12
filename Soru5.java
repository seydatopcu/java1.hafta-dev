import java.util.Scanner;

public class Soru5 {
    public static void main (String[] args) {
        //Soru5 Tek Çift Hesaplama
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sıfır haricinde bir sayı giriniz:");
        int sayi=scanner.nextInt();
        if (sayi %2 == 0) {
            System.out.println("Girilen sayı çifttir.");
        } else {
            System.out.println("Girilen sayı tektir.");
        }
        scanner.close();
    }
}
