package com.tayyaba;

import java.util.Scanner;

public class BookPrototype {

    protected String bookName;
    protected String bookAuthor;
    protected String authorBelongs;
    protected int issueOn;
    Scanner sc=new Scanner(System.in);
    public String getBookName() {
        return bookName;
    }

    public String getAuthorBelongs() {
        return authorBelongs;
    }

    public int getIssueOn() {
        return issueOn;
    }
    public void SpecifyBookType(){
        int selectedOpt;
        System.out.println("Enter Book Type (EBook, AudioBook, LibraryBook");
        selectedOpt= sc.nextInt();

        switch (selectedOpt) {
            case 1 -> System.out.println("Reading Mode: EBook");
            case 2 -> System.out.println("Reading Mode: AudioBook");
            case 3 -> System.out.println("Reading Mode: LibraryBook");
            default -> System.out.println("Not listed Yet.....");
        }
    }
}
