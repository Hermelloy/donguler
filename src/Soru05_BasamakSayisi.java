import java.util.Scanner;

/** Soru 5: Sayının Basamaklarını Bulma */
public class Soru05_BasamakSayisi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.println("sayi giriniz");
        int sayi = sc.nextInt();
        int i;
        for (i = 0; sayi>0 ; i++) {
            sayi=(sayi/10);
        }System.out.println("sayi "+i+" basamaklidir");

         scanner.close();
    }
}
