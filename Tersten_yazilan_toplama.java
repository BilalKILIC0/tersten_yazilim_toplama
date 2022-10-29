// Klavyeden girilen pozitif bir tam sayının tersten yazılmış sayısal değerini elde edem program.
package tersten_yazilan_toplama;
import java.util.Scanner;

/*
Adım 1: Başla 
Adım 2: Kullanıcıdan Bir n değeri al
Adım 3: toplam ve tut değişkeni ata
Adım 4: For döngüsü ile girilen >0 olana kadar döndür 
Adım 5: Eğer girilen%10 == 0 || girilen%10 !=0 ise tut =girilen%10 , toplam +=tut , girilen /10
Adım 6: Toplamı Ekrana Yazdır.
Adım 7: Bitir.
*/

public class Tersten_yazilan_toplama {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Bir Sayı Giriniz :");
        int girilen = input.nextInt();
        
        int toplam =0;
        int tut ;
        
        for (;girilen>0;)
        {
            if (girilen%10 ==0 || girilen%10 !=0)   // Girilen Sayının içinde sıfır olduğunu da düşünmemiz gerekiyor !!!
            {
            tut = girilen%10;
            toplam += tut;
            girilen /=10;
            }
        }
        System.out.println("Girdiğiniz Sayının Basamakları Toplamı :" +toplam);      
    }  
}
