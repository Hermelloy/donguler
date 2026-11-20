import java.util.Scanner;

/** Soru 6: Sayıyı Ters Çevirme */
public class Soru06_SayiyiTersCevir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = sc.nextInt();
        int gecici = sayi;
        int ters=0;
        while (gecici!=0) {
            int sBasamak=gecici%10;
            ters=ters*10+sBasamak;
            gecici=gecici/10;
  
        }System.out.println(ters);

        scanner.close();
    }
}
