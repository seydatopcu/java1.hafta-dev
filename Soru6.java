import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz:");
        int sayi1=scanner.nextInt();
        System.out.println("Lütfen 2. sayıyı giriniz:");
        int sayi2=scanner.nextInt();
        System.out.println("Lütfen 3. sayıyı giriniz:");
        int sayi3=scanner.nextInt();
        if (sayi1>sayi2) {
            int sira=sayi1;
            sayi1=sayi2;
            sayi2=sira;
        }
        if (sayi2>sayi3) {
            int sira=sayi2;
            sayi2=sayi3;
            sayi3=sira;
            if (sayi1>sayi2){
                int sira2=sayi1;
                sayi1=sayi2;
                sayi2=sira2;
            }
        }
        System.out.println("Sayılar küçükten büyüğe sıralandı:"+sayi1+","+sayi2+","+sayi3);
        scanner.close();
    }
}
