
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan Alınan 3 Sayıdan En Büyük Sayıyı Bulma
        Scanner scanner =  new Scanner(System.in);
        
        System.out.print("Birinci Sayı : ");
        int a = scanner.nextInt();
        System.out.print("İkinci Sayı : ");
        int b  = scanner.nextInt();
        System.out.print("Üçüncü Sayı : ");
        int c  = scanner.nextInt();
        
        
        int maks = -1;
        
        if ( a >= b && a >= c) {
            
            maks = a;
        }
        else if (b >= a && b >= c) {
            
            maks = b;
        }
        else {
            
            maks = c;
            
        }
        
        System.out.println("Maksimum Sayı : " + maks);
        
    }
    
}
