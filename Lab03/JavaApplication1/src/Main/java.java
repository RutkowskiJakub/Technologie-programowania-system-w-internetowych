package Main;


import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.io.*;
public class java {



    public static void main(String[] args) {

        
//        List<String> nazwiska = new ArrayList<>();
//        nazwiska.add("Kowalski");
//        nazwiska.add("Nowak");
//        
//        for(String nazwisko : nazwiska){
//            System.out.println(nazwisko);
//        }
//        
//        for (int i=0; i<nazwiska.size(); i++){
//            String nazwisko = nazwiska.get(i);
//            System.out.println(nazwisko);
//        }
//        
//        
//        Map<String, String> dniTygodnia = new HashMap<>();
//        dniTygodnia.put("pn", "poniedziałek");
//        dniTygodnia.put("wt", "wtorek");
//        dniTygodnia.put("sr", "sroda");
//        dniTygodnia.put("czw", "czwartek");
//        
//        String dzien1 = dniTygodnia.get("pn");
//        System.out.println("Skrot 'pn' oznacza: " + dzien1);
//        
//        for (String skrot : dniTygodnia.keySet()){
//            String dzien = dniTygodnia.get(skrot);
//            System.out.println(skrot + " - " + dzien);
//        }
    List<Product> Produkty = new ArrayList<>();
    List<List<Product>> KATEGORIE = new ArrayList<>();

    
    try(BufferedReader in = new BufferedReader(new FileReader("plik.txt")))
    {
        String s = in.readLine();
        while(s!=null)
        {
            String[] tablica = s.split(";");
            //System.out.println(s);
            Double price = Double.parseDouble(tablica[3]);
            Integer numer = Integer.parseInt(tablica[0]);
            //System.out.println(price);
            
            Produkty.add(new Product(numer ,tablica[1], price, tablica[2]));
            
//            for(int i=counter; i<counter+4; i++);
//            {
//                System.out.println(produkt[1]);
//            }
            
            s = in.readLine();
            
        }
    }
    catch (IOException ex)
    {
        ex.printStackTrace();
    }
    System.out.println("Zadanie 3");
    String Linia = "10;poniedzialek";
    System.out.println(Linia);
    String[] pola = Linia.split(";");
    System.out.println(pola[0]);
    System.out.println(pola[1]);
    
    
    for (Product produkt : Produkty )
    {
        System.out.println(produkt);
    }
    
    Map<Integer, Product> mapaProduktow = new HashMap<>();
    Map<String, List<Product>> mapaProduktow2 = new HashMap<>();
    
    
    for (Product produkt : Produkty)
    {
        mapaProduktow.put(produkt.id, produkt);
        
        if(mapaProduktow.containsKey(produkt.getCategory()))
        {
            List<Product> lista = mapaProduktow2.get(produkt.getCategory());
            lista.add(produkt);
            mapaProduktow2.put(produkt.getCategory(), lista);
        }
        else
        {
            mapaProduktow2.put(produkt.getCategory(), new ArrayList<Product>());
            List<Product> lista = mapaProduktow2.get(produkt.getCategory());
            lista.add(produkt);
            mapaProduktow2.put(produkt.getCategory(), lista);
        }
    }

    
    System.out.println("-------1");
    System.out.println(mapaProduktow2.get("oprogramowanie"));

    
    
    
   // Set<String> Kategorie = new HashSet<>();
    

    
//    for (Product produkt : Produkty)
//    {
////        //mapaProduktow2.put(produkt.category, Produkty);
////        String X = produkt.category;
////        System.out.println(X);
////        Kategorie.add(produkt.category);      
//        
//        if (mapaProduktow2.containsKey(produkt.category)==false)
//        {
//            mapaProduktow2.put(produkt.category, List<Product> produkt.category = new ArrayList<>());
//        }
//    }
//    
//    System.out.println("------2");
//    for(String xxx : Kategorie)
//    {
//        for(int i=0; i<Produkty.size(); i++)
//        {
//            Product bbbb = Produkty.get(i);
//                   
//        }
////        for (Product produkt : Produkty)
////        {
////            
////        }
//        
//        System.out.println(xxx);
//    }
//    //List<Product> Cat4 = new ArrayList<>();
//    
//    
//    System.out.println("------3");
//    System.out.println(Kategorie);

    
  
//List<Product> Produkty = new ArrayList<>();

        
        
    
        
    }
    
}
