package Main;


import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
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
    for (Product produkt : Produkty)
    {
        mapaProduktow.put(produkt.id,produkt);
    }
    
    Map<String, List<Product>> mapaProduktow2 = new HashMap<>();
    for (Product produkt : Produkty)
    {
        mapaProduktow2.put(produkt.category, Produkty);
    }
    
    
  


        
        
    
        
    }
    
}
