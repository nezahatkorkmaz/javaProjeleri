
import java.util.ArrayList;


public class Main {
    public static void yazdir(ArrayList<String> a) {
        
        for (int i = 0; i < a.size() ; i++) {
            
            System.out.println("Element " + (i+1) + ": " + a.get(i));
            
        }
    }
    public static void main(String[] args) {
        
        ArrayList<String> arraylist = new ArrayList<String>();
        
        
        arraylist.add("Metallica");
        arraylist.add("Guns' n Roses");
        arraylist.add("Black Sabbath");
        arraylist.add("Iron Maiden");
        arraylist.add("Megadeth");

       // System.out.println(arraylist.get(0));
         //System.out.println(arraylist.get(3));
        // System.out.println(arraylist.get(5));
         
        // System.out.println(arraylist.size());
        
        //arraylist.remove(1);
        //arraylist.remove("Metallica");
        
        /*System.out.println(arraylist.indexOf("Metallica"));
        System.out.println(arraylist.lastIndexOf("Metallica"));
        System.out.println(arraylist.indexOf("Dream Theater"));*/
        
        //arraylist.set(4,"Megadeth");
        
        yazdir(arraylist);
       
        
    }
}
