package com.tayyaba;

import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

public class BookLab {
    private ArrayList<Subject> subjectList;
    private Subject refvar1;
    private SubjectInner refvar2;
    Scanner input = new Scanner(System.in);
    BookLab(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }
    public void addSubjects(Subject subject) {
        subjectList.add(subject);
    }

    public void addSubjects() {
        // Subjects will be only available for this BookLab
        String[] subject = {"Languages", "Novels", "Patriotism", "Web Development", "Aerospace Engineering", "Astrology"};

        for (String s : subject) {
            subjectList.add(new SubjectInner(s + "#"));
        }
    }

    public void removeSubject(String key) {
        for (int i = 0; i < subjectList.size(); i++) {
            if (key.equalsIgnoreCase(subjectList.get(i).getSubName())) {
                subjectList.remove(subjectList.get(i));
                System.out.println(subjectList.get(i).getSubName() + "Subject is successfully removed from BookLab");
            }
        }
    }

    public void displaySubjects() {
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t<<<<<<<< LIST OF SUBJECTS IN BOOKLAB >>>>>>>>>>");
        System.out.println("\n\t\t\t\t\t-----------------------------------------------------------------------------------------------");
        System.out.println("\n\t\t\t\t\t\t\t 1 => Subjects names end with # requires crediantial if you have bought.                   ");
        System.out.println("\n\t\t\t\t\t\t\t 1 => Subjects names end with # only access by bookLab crediantial holders.                ");
        System.out.println("\n\t\t\t\t\t\t\t 1 => If you are asked to enter subject or book so write it in a format which.             ");
        System.out.println("\n\t\t\t\t\t\t\t      is displayed to you.                    ");
        System.out.println("\n\t\t\t\t\t-----------------------------------------------------------------------------------------------");
        System.out.println();
        int sNo = 1;

        for (Subject obj : subjectList) {
            if (sNo % 8 == 0) {
                System.out.println();
            }
            System.out.print(sNo + ") " + obj.getSubName() + "\t\t");
            sNo++;
        }
        System.out.println();
    }

    public void showSelectedSubjectBooks() throws InterruptedException {
        while (true) {
            int i;
            boolean skipStatus = false;
            boolean flag = false;
            String doList;
            boolean mismatch = true;
            System.out.println("\n => Enter Subject name From giving list...");
            while (true) {
                doList = input.nextLine();
                for (i = 0; i < subjectList.size(); i++) {
                    if (doList.equals(subjectList.get(i).getSubName())) {
                        mismatch = false;
                        break;
                    }
                }
                if (!mismatch) {
                    break;
                } else {
                    System.out.println("=> Please Write in Given Format!!!");
                }
            }
            for (i = 0; i < subjectList.size(); i++) {
                if (doList.equalsIgnoreCase(subjectList.get(i).getSubName())) {
                    if (doList.contains("#")) {

                        refvar2 = (SubjectInner) subjectList.get(i);
                       refvar2.show();
                       skipStatus= refvar2.skipStatus();

                    } else {
                        refvar1 = subjectList.get(i);
                    }
                    break;
                }
            }

            if (!skipStatus) {
                switch (doList) {
                    case "Computing" -> {
                        String[] computing = {"Computer hardware", "Computer networking", "Computer programming", "Computer science", "Computer software", "History of Computation", "Information technology", "Internet", "Open source"};
                        refvar1.showSelectedSubjectBooks(computing);
                    }

                    case "Humanities" -> {
                        String[] humanities = {"Fine arts", "History of Arts", "Law of Humanity", "Literature", "Performing arts", "Philosophy", "Religion"};
                        refvar1.showSelectedSubjectBooks(humanities);
                    }
                    case "Science" -> {
                        String[] sciences = {"Health sciences", "Life sciences", "Physical sciences", "Science study guides"};
                        refvar1.showSelectedSubjectBooks(sciences);
                    }
                    case "Mathematics" -> {
                        String[] mathematics = {"Applied mathematics", "Elementary arithmetic", "K-12 mathematics", "Mathematical collections", "Mathematical references", "Mathematics history", "Mathematics study guides", "Pure mathematics", "University level mathematics books"};
                        refvar1.showSelectedSubjectBooks(mathematics);
                    }
                    case "Engineering" -> {
                        String[] engineering = {"Biomedical engineering", "Chemical engineering", "Civil engineering", "Electrical engineering", "General engineering", "Materials engineering", "Mechanical engineering", "Nuclear engineering", "Systems engineering"};
                        refvar1.showSelectedSubjectBooks(engineering);
                    }
                    case "SocialSciences" -> {
                        String[] socialSciences = {"Anthropology", "Business", "Communication", "Economics", "Education", "Geography", "History of SocialSciences", "Law of SS", "Linguistics", "Political science", "Psychology"};
                        refvar1.showSelectedSubjectBooks(socialSciences);
                    }
                    case "Languages#" -> {
                        String[] languages = {"Urdu", "English", "French", "Ethics"};
                        refvar2.showSelectedSubjectBooks(languages);
                    }
                    case "Novels#" -> {
                        String[] novels = {"The Wandering Falcon", "Seasons Of the Rain Birds", "Butterfly Dreams"};
                        refvar2.showSelectedSubjectBooks(novels);
                    }
                    case "Patriotism#" -> {
                        String[] patriptism = {"The Nation of Politicians", "The Truth about Patriotism", "The Battle of Belonging", "The Last Refuge", "Kargil", "", ""};
                        refvar2.showSelectedSubjectBooks(patriptism);
                    }
                    case "Web Development#" -> {
                        String[] webDev = {"Design and Build Web Sites", "The Definitive Guide", "Eloquent Javascript", "Don't Make Me Think"};
                        refvar2.showSelectedSubjectBooks(webDev);
                    }
                    case "Aerospace Engineering#" -> {
                        String[] aeroEng = {"Aircraft structures", "The Wright Brothers", "Rocket Propulsion Elements"};
                        refvar2.showSelectedSubjectBooks(aeroEng);
                    }
                    default -> System.out.println("\n!!!!!!!!No Updates Yet");
                }
            }

                System.out.println("!!!!!!!!!!!Toggle to another Subjects collection(y/n)...");
                String check = input.nextLine();
                if (check.charAt(0) != 'y') {
                    System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t>>>>>>>> History <<<<<<<<<<<<\n");
                    showHistory(Subject.bookList);
                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t>>>>>>>>>>>>>><<<<<<<<<<<<<<<");
                    System.out.println("\n\nWish You Have a Good Time Here...");
                    break;
                }

            }
        }


    public void showHistory(ArrayList<Book> bookList) {
        for (Book book : bookList) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t->    " + book.getBookName());
        }
    }
    class Crediantials  {
        private  static ArrayList<Integer> listCrediantial = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        private boolean skip;
        private Login thread1;

        Crediantials() {

        }

        public boolean getSkipStatus() {
            return skip;
        }

        public void ValidateNot() throws InterruptedException {
            int crediantial;
            boolean mismatch = true;
            listCrediantial.add(123);
            listCrediantial.add(234);
            listCrediantial.add(345);
            listCrediantial.add(456);
            listCrediantial.add(567);
            listCrediantial.add(678);
            listCrediantial.add(789);
            listCrediantial.add(890);
            listCrediantial.add(122);
            listCrediantial.add(233);
            listCrediantial.add(344);
            System.out.println("\n=> Enter your membership crediantial...");
            int j;
            int[] array;
            boolean accessStatus = false;
            int copycrediantial;
            do {
                while (true) {
                    j = 0;
                    crediantial = sc.nextInt();
                    copycrediantial = crediantial;
                    int crediantialSize = Integer.toString(crediantial).length();
                    array = new int[crediantialSize];
                    while (copycrediantial != 0) {
                        array[crediantialSize - j - 1] = copycrediantial % 10;
                        copycrediantial = copycrediantial / 10;
                        j++;
                    }
                    if (!(array.length > 3 | array.length < 3)) {
                        break;
                    } else {

                        System.out.println("=> !!!!!Credential Valid Format is upto three Digits!!!");
                        System.out.println("=> Try Again..");
                    }
                }
                for (Integer integer : listCrediantial) {
                    if (integer == crediantial) {
                        accessStatus = true;
                        System.out.println("Crediantial Exist...");
                        break;
                    }
                }
                try {
                    if (!accessStatus) {
                        throw new IllegalArgumentException("You are not Holding a membership crediantial!!!");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                if (!accessStatus) {
                    System.out.println("(1) Want to skip this subject ? (2) Generating crediantials...");
                    int check = sc.nextInt();
                    if (check == 1) {
                        skip = true;
                        break;
                    } else if (check == 2) {
                        skip = false;
                        System.out.println("Wait we are generating a new crediantial for you!!!!!!!!");
                        thread1=new Login();
                        thread1.start();
                        thread1.join();
                        Thread.sleep(4000);
                        listCrediantial.add(thread1.getNewCredit());
                        System.out.println("Your credit number is.. " + thread1.getNewCredit());
                        System.out.println("Let's Try with your Crediantial......");
                    }
                }

                else {
                    skip = false;
                  break;
                }
            } while (!accessStatus);

        }
    }


class Login extends Thread{
      int newCredit;
    Random number =new Random();
            Login(){

      }
    public  void run(){
        int credit;
        try {

            System.out.println("Working..........");
             credit= number.nextInt(899)+100;
             sleep(4000);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       newCredit=credit;
    }

    public  int getNewCredit() {

        return newCredit;
    }
}






    class SubjectInner extends Subject  {

        private Crediantials credit=new Crediantials();
        SubjectInner(String subName) {
            super(subName);
        }

        public void show() throws InterruptedException {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tDESCLAIMER!!!!!!!!");
            System.out.println("\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t\t\t* CUSTOMER HOLDING CREDIANTIALS ONLY ACCESS THESE SUBJECTS...");
            System.out.println("\t\t\t\t\t\t\t\t\t\t* Crediantials digit format contain only three numbers...");
          credit.ValidateNot();
        }
        public boolean skipStatus(){

            return credit.getSkipStatus();

        }
    }
}