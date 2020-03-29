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
        System.out.println(email);
    }
    
    Student ja = new Student("Jakub", "Rutkowski", "rj34361@wi.zut.edu.pl", "32D");
    ja.getFirstName();
    System.out.println(ja);
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
    
    
    Map<String, Person> osoby = new HashMap<>();
    osoby.put("90010112345", new Person("Jan", "Kowalski","JanKowalski@mail.pl"));
    
    Map<Integer, List<Student>> grupy = new HashMap<>();
    List<Student> grupa32 = new ArrayList<>();
    }
}
