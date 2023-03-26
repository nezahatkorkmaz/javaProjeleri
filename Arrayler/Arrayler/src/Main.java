
import java.util.Scanner;

public class Main {
    public static void arrayi_bastir(int[] array) {
        
        for (int i = 0; i < array.length ; i++ ) {
            System.out.println("Element " + (i+1) + ":" + array[i]);
            
        }
   
    }
    public static double ortalamabul(int[] array) {
        int toplam = 0;
        
        for (int i = 0; i < array.length ; i++) {
            toplam += array[i];
            
        }
        return ((double)toplam / array.length);
        
        
    }
    public static void main(String[] args) {
        
        //int a = 5;
        int[] a = new int[5];
        
        int[] b = {10,20,30,40,50,60};
        //System.out.println("Arrayimizin Uzunluğu : " + b.length);
        
        arrayi_bastir(b);
        
        System.out.println("Ortalama: " + ortalamabul(b));
        //Scanner scanner =  new Scanner(System.in);
        /*for (int i = 0; i < 5 ; i++) {
            a[i] = scanner.nextInt();
            
         }*/
        
        /*for (int i = 0; i < 5 ; i++) {
            
            a[i] = i * 4 + 2;
            
        }*/
       // System.out.println("-----------------------------------------");
        /*for (int i = 0; i < 5 ; i++) {
            
            System.out.println(a[i]);
            
            
        }*/
       // System.out.println(a[0]);
        // System.out.println(a[2]);
        // System.out.println(a[6]); Hata verir.
        
        
        
        
        
        
        /*a[5] = 32;
        a[9] = 50;*/
        
        //double[] b;
        
        
        
   
        
    }
    
    
    
}
