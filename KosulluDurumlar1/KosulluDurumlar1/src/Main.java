
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        /*
        if (kosul) {
            Koşul sağlanınca(true) bu blok çalışır. 
        
        }
        
        else {
            Bu bloğun üstündeki herhangi bir koşul sağlanmadığında bu blok çalışır.
        
        }
        
        */
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lütfen bir sayı girin:");
        
        int sayi = scanner.nextInt();
        
        if (sayi < 0) {
            
            System.out.println("Negatif");
            
            
        }
        else {
            System.out.println("Pozitif veya 0");
            
            
        }
        
        
        
        
        
    }
    
}
