import java.util.Scanner;

/** Soru 8: Tahmin Oyunu */
public class Soru08_TahminOyunu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayi=93;
        int tahmin=0;
         while (tahmin!=sayi) {
             System.out.println("tahmin giriniz");
             tahmin = sc.nextInt();
            if (tahmin<sayi){System.out.println("daha buyuk bir sayi girin");
                    }
            else if (tahmin>sayi){System.out.println("daha kucuk bir sayi girin");
                    }
            else {System.out.println("dogru bildiniz");
                    }
            }
               scanner.close();
            }
            
        }
      
