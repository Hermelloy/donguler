import java.util.Scanner;

/** Soru 9: Sayıların Ortalaması */
public class Soru09_SayilarinOrtalamasi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                Scanner sc = new Scanner(System.in);
        float sayi;
        float toplam=0;
        int n=0;
        int p=0;
        int s=0;
        float sonuc;
         for (int i = 1; i<=10; i++) { 
             System.out.println("sayi giriniz");
             sayi=sc.nextInt();
             toplam=toplam+sayi;
             if (sayi<0) {n=n+1;
             }else if (sayi>0){p=p+1;
             }else if (sayi==0) {s=s+1;
             }
            }sonuc=toplam/10;
            System.out.println("sayilarin ortalamasi "+sonuc+" girdiginiz sayilarin "+n+" tanesi negatif "+p+" tanesi pozitif "+s+" tanesi sifirdir");

        scanner.close();
            
        }
}
