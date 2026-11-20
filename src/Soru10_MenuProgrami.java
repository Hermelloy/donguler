import java.util.Scanner;

/** Soru 10: Menü Tabanlı İşlem Programı */
public class Soru10_MenuProgrami {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean dongu=true;
        while (dongu==true) 
            {System.out.println("- 1: Bir sayinin karesini hesapla.\n"+
"- 2: Bir sayinin kupunu hesapla.\n "+
"- 3: Bir sayinin tek veya cift oldugunu kontrol et.\n"+
"- 4: Bir sayinin pozitif, negatif veya sifir oldugunu belirle.\n"+
"- 5: Programdan cik.");
        int sayi = sc.nextInt();
switch (sayi) {
                case 1:
                    System.out.println("sayi girin");
                    int sayi2 = sc.nextInt();
                    System.out.println(sayi2*sayi2);
                    
                    break;
                case 2:
                    System.out.println("sayi girin");
                    int sayi3 = sc.nextInt();
                    System.out.println(sayi3*sayi3*sayi3);
                    
                    break;
                case 3:
                    System.out.println("sayi girin");
                    int sayi4 = sc.nextInt();
                    if (sayi4%2==0){System.out.println("sayi cifttir");
                    }else {System.out.println("sayi tektir");
                    } 
                    break;
                case 4:
                    System.out.println("sayi girin");
                    int sayi5 = sc.nextInt();
                    if (sayi5<0){System.out.println("sayi negatiftir");
                    }else if (sayi5==0){System.out.println("sayi sifirdir");
                    }else {
                        System.out.println("sayi pozitiftir");
                    }
                    break;
                case 5:
                    dongu=false;
                    System.out.println("gorusuruz");
                     
                    break;
                default:
                    dongu=false;
                    
            }
            
        }
        
        scanner.close();
} 
}
