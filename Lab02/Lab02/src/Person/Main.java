/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Student
 */
public class Main
{
    public static void main(String[] args)
    {
    Person p1 = new Person("Bill", "Gates", "BillGates@microsoft.com");
    Person p2 = new Person("Gal", "Anonim", "ganonim@gmail.com");

    System.out.println(p1);
    System.out.println(p2);
    
    University zut = new University("ZUT", "zut@zut.edu.pl");
    University wsks = new University("Wyższa Szkoła Kosmetologii Stosowanej w Koluszkach", "wsks@wsks.edu.pl");
    Person s1 = new Student("Jan", "Kowalski", "jkowalski@wi.zut.edu.pl", "32A");
    Person s2 = new Student("Hermenegilda", "Nowak", "henowak@wi.zut.edu.pl", "32A");
    Person t1 = new Teacher("Bjarne", "Stroustrup", "bjarne@fake.org", "Introduction to C++");

    
    EmailRecipient[] spamList = new EmailRecipient[5];
    spamList[0] = zut;
    spamList[1] = wsks;
    spamList[2] = s1;
    spamList[3] = s2;
    spamList[4] = t1;

    for(EmailRecipient recipient : spamList) 
    {
        String email = recipient.getEmailAddress();
        //System.out.println(email);
    }
    
    Student ja = new Student("Jakub", "Rutkowski", "rj34361@wi.zut.edu.pl", "32D");
    ja.getFirstName();
    //System.out.println(ja);
    ja.addGrade(3);
    ja.addGrade(5);
    ja.addGrade(3);
    ja.addGrade(2);
    ja.getGradesAverage();
    Faculty f1 = new Faculty("Analiza Matematyczna i Algebra Liniowa I","amial2@zut.edu.pl");
    zut.addFaculty(f1);
    Faculty f2 = new Faculty("Technologie Programowania Systemów Internetowych","TPSI@zut.edu.pl");
    zut.addFaculty(f2);
    zut.getFaculties();
    
    
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
        
    
    
    Map<String, Person> osoby = new HashMap<>();
    osoby.put("90010112345", new Person("Jan", "Kowalski","JanKowalski@mail.pl"));
    
    Map<Integer, List<Student>> grupy = new HashMap<>();
    List<Student> grupa32 = new ArrayList<>();
    grupa32.add(new Student("Jan", "Kowalski", "JanKowalski@mail.pl", "32"));
    grupa32.add(new Student("Zenon", "Nowak", "ZenonNowak@mail.pl", "32"));
    grupy.put(32, grupa32);
    
    
    //Set<String> zbiorDni = new HashSet<>();
    Set<String> zbiorDni = new TreeSet<>();
    //Zbior dni utworzony za pomoca TreeSet jest posortowany w kolejnosci alfabetycznej. HashSet jest szybszy niz TreeSet
    //W sytuacji gdy zalezy nam na posortowanych elementach lepiej jest uzyc TreeSet, a gdy zalezy nam na szybkosci lepiej jest uzyc TreeSet
    //Nie, nie trzeba bylo nic zmieniac oprocz deklaracji
    zbiorDni.add("poniedziałek");
    zbiorDni.add("wtorek");
    zbiorDni.add("sroda");
    zbiorDni.add("czwartek");
    zbiorDni.add("piatek");
    zbiorDni.add("sobota");
    zbiorDni.add("niedziela");

    
    System.out.println("-------");
    System.out.println(zbiorDni);
    
    for(String dzien : zbiorDni){
        System.out.println(dzien);
    }
    
    
    //Zadanie 2
    System.out.println("ZADANIE 2");
    Map<String, Teacher> wykazProwadzacych = new HashMap<>();
    wykazProwadzacych.put("Programowanie Obiektowe", new Teacher("Maciej", "Poliwoda", "Maciej.Poliwoda@zut.edu.pl", "PO"));
    wykazProwadzacych.put("Technologie Programowania Systemów Internetowych", new Teacher("Michał", "Kramarczyk", "Michal.Kramarczyk@zut.edu.pl", "TPSI"));
    Teacher NauczycielPO = wykazProwadzacych.get("Programowanie Obiektowe");
    NauczycielPO.getFirstName();
    System.out.println(NauczycielPO);
    System.out.println("------");
    List<Student> grupa33 = new ArrayList<>();
    List<Student> grupa34 = new ArrayList<>();
    
    Map<Integer, List<Student>> listaGrup = new HashMap<>();
    listaGrup.put(32,grupa32);
    listaGrup.put(33,grupa33);
    listaGrup.put(34,grupa34);
    grupa32.add(new Student("Robert", "Iksinski", "RobertIksinski@mail.pl", "32"));
    List <Student> listaStudentow = new ArrayList<>();
    listaStudentow = listaGrup.get(32);
    for (Student czlonekGrupy : listaStudentow)
    {
        czlonekGrupy.getFirstName();
        System.out.println(czlonekGrupy);
    }
    
    
    
    
    
    }
}
