import java.util.Scanner;

public class Soru9 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Hangi şeklin alanını hesaplamak istiyorsunuz(kare,üçgen,dikdörtgen)?:");
        String secilenSekil=scanner.nextLine();
        double alan = 0;
        switch (secilenSekil) {
            case "kare":
                System.out.print("Karenin kenar uzunlğunu girin:");
                double kareKenar=scanner.nextDouble();
                alan=kareKenar*kareKenar;
                break;
            case "üçgen":
                System.out.print("Üçgenin taban uzunluğunu girin:");
                double ucgenTaban=scanner.nextDouble();
                System.out.print("Üçgenin yüksekliğini girin:");
                double ucgenYukseklik=scanner.nextDouble();
                alan=0.5*ucgenTaban*ucgenYukseklik;
                break;
            case "dikdörtgen":
                System.out.print("Dikdörtgenin uzun kenarını giriniz:");
                double dikdörtgenUzunKenar=scanner.nextDouble();
                System.out.print("Dikdörtgenin kısa kenarını giriniz:");
                double dikdörtgenKısaKenar=scanner.nextDouble();
                alan=dikdörtgenUzunKenar*dikdörtgenKısaKenar;
                break;
            default:
                System.out.print("Geçersiz şekil seçimi!");
                return;
        }
        System.out.println(secilenSekil+"alanı:"+alan);
        scanner.close();
    }
}
