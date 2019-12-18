package com.example.example.Collections;

import com.example.example.ContactAppDemo.Contact;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        Contact lContact1 = new Contact();
        lContact1.setlFirstName("Dv");

        Contact lContact2 = lContact1;
        lContact2.setlFirstName("Divy");

        Contact lContact3 = new Contact();

        List<Contact> lList1 = new ArrayList<>();
        lList1.add(lContact1);
        lList1.add(lContact2);
        lList1.add(lContact3);



        List<Contact> lList2 = lList1;

        lList2.remove(lContact3);
        lList2.remove(lContact1);

        lContact1.setlFirstName("Jeno ");

        System.out.println(lList1.toString());
        System.out.println(lList2.toString());

        System.out.println(lList1.size());
        System.out.println(lList2.size());


    }
}
