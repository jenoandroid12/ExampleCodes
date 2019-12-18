package com.example.example.example;

import com.example.example.ContactAppDemo.Contact;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {

    public static void main(String[] args) {
        Contact lContact1 = new Contact();
        lContact1.setlFirstName("Dv");

        Contact lContact2 = lContact1;
        lContact2.setlFirstName("Divy");

        Contact lContact3 = new Contact();

        Contact lContact4 = new Contact();

        Set<Contact> lSet1 = new HashSet<>();
        lSet1.add(lContact1);
        lSet1.add(lContact2);
        lSet1.add(lContact4);

        Set<Contact> lSet2 = lSet1;

        Set<Contact> lSet3 = lSet2;
        lSet2.remove(lContact2);
        lSet3.add(lContact2);
        lSet2.add(lContact3);

        lSet2.add(null);
        System.out.println(lSet1.size());
        System.out.println(lSet2.size());
        System.out.println(lSet3.size());

        lContact2.setlFirstName("Jno");

        System.out.println(lSet1.toString());
        System.out.println(lSet2.toString());

    }
}
