import java.util.Scanner;

/** Soru 7: Asal Sayı Kontrolü */
public class Soru07_AsalSayi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = sc.nextInt();
        boolean asal = true;
        if (sayi<=1){asal=false;
        }else{
            for (int i = 2; i < sayi; i++) {
                if (sayi%i==0){asal=false;
                }
            
        }
     
    }if (asal==true){System.out.println("sayi asaldir");
    } else{System.out.println("sayi asal degildir");
            
            
    
         }

        scanner.close();
      }
   }
