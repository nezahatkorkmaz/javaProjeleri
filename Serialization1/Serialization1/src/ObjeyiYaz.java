
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiYaz {
    public static void main(String[] args) {
        
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){

            Ogrenci ogrenci1 = new Ogrenci("Mustafa Murat",1234, "Bilgisayar Mühendisliği");
            Ogrenci ogrenci2 = new Ogrenci("Oğuz",678, "Finansal Matematik");
            
            out.writeObject(ogrenci1);
            out.writeObject(ogrenci2);
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı...");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken IOException Oluştu...");
        }
    }
    
}
