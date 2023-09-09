
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        /*
        do {
            // Koşul doğru olduğu sürece
            // whiledan farkı en az bir kere çalışmasının garanti olması.
        
        }while(koşul);
        
        
        */
       /* int i = 0;
        
        do {
            System.out.println("i = " + i);
            i++;
            
        }while(i < 5);*/
       
       // 1234
       
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("Bir sayı giriniz:");
        
        int sayi = scanner.nextInt();
        int toplam = 0;
        
        do {
            toplam += sayi % 10;
            
            sayi /= 10;
            System.out.println("Sayı: " + sayi);
        }while(sayi > 0);
        
        System.out.println("Rakamları Toplamı = " + toplam);
        
        
        
        
        
        
    }
    
}
