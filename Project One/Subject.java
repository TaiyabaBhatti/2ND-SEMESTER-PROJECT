package com.tayyaba;

import java.util.ArrayList;

import java.util.Scanner;

public class Subject {
    protected String subName;
    static ArrayList<Book> bookList=new ArrayList<>();
    Scanner sc=new Scanner(System.in);

    Subject(String subName){
        this.subName=subName;
    }
    public String getSubName() {
        return subName;
    }

 public void showSelectedSubjectBooks(String[] computing) {
     System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t>>>>>>>> Selected Subject is " + subName + " <<<<<<<<<<<<\n");
     int count = 1;
     String bookName;
     String check;
     for (String s : computing) {
         if (count % 5 == 0) {
             System.out.println();
         }
         System.out.print("(" + s + ")\t");
         count++;
     }

     do {
boolean mismatch=true;
         System.out.println("\n\n=> Enter Book From giving list");
         while (true) {
             bookName= sc.nextLine();
             for (String s : computing) {
                 if (bookName.equals(s)) {

                     mismatch = false;
                     break;
                 }
             }
             if (!mismatch){
                 break;
             }
             else {
                 System.out.println("=> Please Write in Given Format!!!");
             }
         }
         System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t>>>>>>>> Book To Read <<<<<<<<<<<<\n");
         bookList.add(new Book(bookName));
         System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t>>>>>>>> -------------- <<<<<<<<<<\n");
         System.out.println("Read Another??");
        check=sc.nextLine();
     }
     while (check.charAt(0)=='y');
 }
 }
















