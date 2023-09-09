
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        // Polymorphism kullanarak Beyblade Programı
        System.out.println("Beyblade Programına Hoşgeldiniz...");
        System.out.println("Çıkış için q'ya basın...");
        
        Scanner scanner =  new Scanner(System.in);
        
        while(true) {
            System.out.println("Hangi Beyblade'i üretmek istiyorsunuz ? ");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                
                System.out.println("Programdan Çıkılıyor...");
                break;
                
            }
            else {
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                
                Beyblade beyblade = fabrika.beybladeUret(islem);
                
                if (beyblade == null) {
                    
                    System.out.println("Lütfen geçerli bir beyblade ismi girin...");
                }
                else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
                
                
            }
            
            
            
        }
        
        
    }
}
