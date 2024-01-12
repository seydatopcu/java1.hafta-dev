import java.util.Scanner;

public class Soru7 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir hava durumu kodu girin(Güneşli:1, Yağmurlu:2, Bulutlu:3, Rüzgarlı:4):");
        int havaDurumuKodu=scanner.nextInt();
        switch (havaDurumuKodu) {
            case 1:
                System.out.println("Hava Güneşli");
                break;
            case 2:
                System.out.println("Hava Yağmurlu");
                break;
            case 3:
                System.out.println("Hava Bulutlu");
            case 4:
                System.out.println("Hava Rüzgarlı");
                break;
            default:
                System.out.println("Geçersiz kod girdiniz.");
        }
        scanner.close();
    }
}
