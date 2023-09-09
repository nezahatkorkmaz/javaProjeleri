
import java.util.Scanner;


public class Main {
    /*
    Kullanıcıdan Vize1,Vize2  ve Final notunu alarak bir harf hesaplama sistemi yapmaya çalışın. 
    Ayrıca kullanıcıdan okuldaki genel ortalamasını alarak,  
    DD alma ve 2.50’nin altında olma koşuluna göre ekrana bir tavsiye mesajı yazdırın. 

    Vize1 toplam notun %30'una etki edecek.

    Vize2 toplam notun %30'una etki edecek.

    Final toplam notun %40'ına etki edecek.


    Toplam Not >=  90 -----> AA

    Toplam Not >=  85 -----> BA

    Toplam Not >=  80 -----> BB

    Toplam Not >=  75 -----> CB

    Toplam Not >=  70 -----> CC

    Toplam Not >=  65 -----> DC

    Toplam Not >=  60 -----> DD

    Toplam Not >=  55 -----> FD

    Toplam Not <  55 -----> FF

    */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vize1 : ");
        int vize1  = scanner.nextInt();
        System.out.print("Vize2 : ");
        int vize2  = scanner.nextInt();
        System.out.print("Final : ");
        int finalnot  = scanner.nextInt();
        System.out.print("Okul Ortalamanız:");
        double ortalama = scanner.nextDouble();
        
        double toplamnot = (vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalnot * 4 / 10.0);
        
        if (toplamnot >= 90) {
            
            System.out.println("AA aldınız...");
        }
        else if (toplamnot >= 85) {
            System.out.println("BA aldınız...");
        }
        else if (toplamnot >= 80) {
            System.out.println("BB aldınız...");
        }
        else if (toplamnot >= 75) {
            System.out.println("CB aldınız...");
        }
        else if (toplamnot >= 70) {
            System.out.println("CC aldınız...");
        }
        else if (toplamnot >= 65) {
            System.out.println("DC aldınız...");
        }
        else if (toplamnot >= 60) {
            System.out.println("DD aldınız...");
            
            if (ortalama < 2.50) {
                
                System.out.println("DD aldınız ve Not ortalamanız düşük. Bu dersi tekrardan almayı düşünebilirsiniz.");
            }
        }
        else if (toplamnot >= 55) {
            System.out.println("FD aldınız ve Kaldınız...");
        }
        else {
            System.out.println("FF aldınız ve Kaldınız...");
        }
        
    }
    
}
