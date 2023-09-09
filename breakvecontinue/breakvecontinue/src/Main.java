
import java.util.Scanner;

public class Main {
    
    
    public static void main(String[] args) {
        
        /*
            break anahtar kelimesi
         
            Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karşılaştığı zaman çalışmasını durdurur.
            Böylelikle döngü hiçbir koşula bağlı kalmadan sonlanmış olur.
            
            break ifadesi sadece ve sadece içinde bulunduğu döngüyü sonlandırır. Eğer iç içe döngüler varsa
            ve içteki döngüde break kullanılmışsa sadece içteki döngü sona erer.
         
            continue anahtar kelimesi 
            
            Döngü herhangi bir yerde ve herhangi bir zamanda continue ifadesiyle karşılaştığı zaman geri kalan 
            işlemlerini yapmadan direk döngü bloğunun başına döner.
        
            
            
        */
        /*Scanner scanner = new Scanner(System.in);
        
        while(true) {
            
            int islem = scanner.nextInt();
            
            if (islem == -1){
                System.out.println("Döngüden çıkılıyor....");
                break;
            }
            System.out.println("İşlem :" + islem);
            
        }*/
        
        int i = 0;
        
        while (i < 10) {
            
            if (i == 3 || i == 5) {
                i++;
                continue;
            }
            System.out.println("i = " + i );
            i++;
            
        }
        
                
    }



}
