
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        /*
        switch(op) {
            case durum1:
                islemler
                break
            case durum2:
                islemler
                
                break
                //
                //
            default:
                islemler
                break
        
        
        }
        
        */
        
        Scanner scanner = new Scanner(System.in);
        
        int islem = scanner.nextInt();
        
        switch(islem){
            case 1:
                System.out.println("1.işlem");
                
            case 2:
                System.out.println("2.işlem");
                
            case 3:
                System.out.println("3.işlem");
                
            case 4:
                System.out.println("4.işlem");
                
            default:
                System.out.println("Geçersiz işlem...");
                break;
            
            
            
        }
    }
    
}
