package com.example.example.Collections;

import com.example.example.ContactAppDemo.Contact;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Contact lContact1 = new Contact();
        lContact1.setlFirstName("Dv");

        Contact lContact2 = lContact1;
        lContact2.setlFirstName("Divy");

        Contact lContact3 = new Contact();

        Map<String,Contact> lMap1 = new HashMap<>();
        lMap1.put("firstName",lContact1);
        lMap1.put("SecName",lContact2);
        lMap1.put("thirsName",lContact3);


        Map<String,Contact> lMap2 = lMap1;
        lMap2.put("thirsName",lContact3);
        lMap2.put(null,null);
        lMap2.put("ggg",null);

        lMap1.remove(null);

        lContact2.setlFirstName("Jeno ");



        System.out.println(lMap1.toString());
        System.out.println(lMap2.toString());

        System.out.println(lMap1.size());
        System.out.println(lMap2.size());


    }
}
