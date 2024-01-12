import java.util.Scanner;
public class Soru3 {
    public static void main(String[] args) {
//Soru3: Not Hesaplama
        //Kullanıcıdan not bilgisini girmesini iste
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen notunuzu giriniz:");
        double not = scanner.nextInt();
        //Harf notu belirleme
        String harfNotu;
        if (not >=90 && not <= 100) {
            harfNotu = "AA";
        }
        else if (not >= 80 && not <= 89) {
            harfNotu = "BA";
        }
        else if (not >= 70 && not <= 79) {
            harfNotu = "BB";
        }
        else if (not >= 60 && not <= 69) {
            harfNotu = "CB";
        }
        else if (not >= 50 && not <= 59) {
            harfNotu = "CC";
        }
            else {
                harfNotu = "FF";
            }
                System.out.println("Öğrencinin Harf Notu:" + harfNotu);
    }
}
