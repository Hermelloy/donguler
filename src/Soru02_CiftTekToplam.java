import java.util.Scanner;

/** Soru 2: Çift ve Tek Sayıların Toplamı */
public class Soru02_CiftTekToplam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           System.out.println("sayi giriniz");
        int sayi =sc.nextInt();
        int cToplam = 0;
        int tToplam = 0;
         
        for (int i = 0; i <=sayi; i++) {
            if (i%2==0){cToplam=cToplam+i;
            }else {tToplam=tToplam+i;
            }
            
            }System.out.println("bu sayiya kadar olan cift sayilarin toplami "+cToplam+" tek sayilarin toplami "+tToplam);
        
         scanner.close();
    }
}

 
