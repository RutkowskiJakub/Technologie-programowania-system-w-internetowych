package Main;


import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class java {



    public static void main(String[] args) {

        
        List<String> nazwiska = new ArrayList<>();
        nazwiska.add("Kowalski");
        nazwiska.add("Nowak");
        
        for(String nazwisko : nazwiska){
            System.out.println(nazwisko);
        }
        
        for (int i=0; i<nazwiska.size(); i++){
            String nazwisko = nazwiska.get(i);
            System.out.println(nazwisko);
        }
        
        
        Map<String, String> dniTygodnia = new HashMap<>();
        dniTygodnia.put("pn", "poniedziałek");
        dniTygodnia.put("wt", "wtorek");
        dniTygodnia.put("sr", "sroda");
        dniTygodnia.put("czw", "czwartek");
        
        String dzien1 = dniTygodnia.get("pn");
        System.out.println("Skrot 'pn' oznacza: " + dzien1);
        
        for (String skrot : dniTygodnia.keySet()){
            String dzien = dniTygodnia.get(skrot);
            System.out.println(skrot + " - " + dzien);
        }
        
        
     
        
    }
    
}
