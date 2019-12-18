package com.example.example.Collections;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<Book> set=new HashSet<Book>();

        LinkedHashSet<Book> books = new LinkedHashSet<>();

        TreeSet<String> treeSet = new TreeSet<>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to HashSet
        set.add(b1);
        set.add(b2);
        set.add(b3);

        books.add(b1);
        books.add(b2);
        books.add(b3);

        treeSet.add("help");
        treeSet.add("zee");
        treeSet.add("apple");
        //Traversing HashSet
        for(Book b:set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);

        }
        System.out.println("\n");
        for(Book b:books){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);

        }
        System.out.println("\n");
        for(String b:treeSet){
            System.out.println(b);

        }
        System.out.println("\n");
    }

}
