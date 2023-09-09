
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
         /*
        Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle indeksini bulun.

        Beden Kitle İndeksi : Kilo / Boy(m) * Boy(m)
    
        */
         Scanner scanner = new Scanner(System.in);
         
         System.out.print("Kilonuzu Girin:");
         int kilo = scanner.nextInt();
         System.out.print("Boyunuzu Girin:(Örnek :  1,72)");
         double boy = scanner.nextDouble();
         
         double bki = kilo / (boy * boy);
         
         System.out.println("Beden Kitle Indeksiniz : " + bki);
         

        
    }
}
