public class Main {

    public static void main(String[] args) {
          /*
          Mantıksal Operatörler
          && --> and Operatörü
          Bütün sonuçlar kendi içinde true ise genel sonuç true, en az birisi bile false ise genel sonuç false olur.
          
          || --> or Operatörü
          Sonuçlardan en az birisi bile true ise genel sonuç true,hepsi false ise genel sonuç false olur.
        
          ! ---> not Operatörü       
          */
          /*
          System.out.println(3 == 3);
          System.out.println(2 < 3);
          System.out.println("Murat" =="Murat");*/
          
          
          //System.out.println(3 != 3 || 2 > 3 || "Murat" !="Murat");
          
          //System.out.println(!(3 < 4));
          
          System.out.println(!((3 < 4 && "Murat" == "Murat") || 3.4 > 2.1));
          
    }

    
}
