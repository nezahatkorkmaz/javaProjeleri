
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        if (scanner.hasNextInt()){
              int sayi = scanner.nextInt();
              System.out.println("Sayı: " + sayi);
        }
        else {
            System.out.println("Lütfen bir sayı giriniz....!");
            
        }
      
        
        
        
        
    }
    
}
