import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen birinci sayıyı giriniz:");
        double sayi1 = scanner.nextDouble();
        System.out.print("Lütfen ikinci sayıyı giriniz:");
        double sayi2=scanner.nextDouble();
        System.out.print("Yapmak istediğiniz işlemi seçin(Toplama(+), Çıkarma(-), Çarpma(-), Bölme(/)):");
        char islem=scanner.next().charAt(0);
        double sonuc=0;
        switch (islem){
            case '+':
                sonuc=sayi1+sayi2;
                break;
            case '-':
                sonuc=sayi1-sayi2;
                break;
            case '*':
                sonuc=sayi1*sayi2;
                break;
            case  '/':
                if(sayi2 !=0){
                    sonuc=sayi1/sayi2;
                }else {
                    System.out.println("Sıfıra bölünemez");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz işlem!");
                return;
        }
        System.out.println("Sonuç:"+sonuc);
        scanner.close();
    }
}
