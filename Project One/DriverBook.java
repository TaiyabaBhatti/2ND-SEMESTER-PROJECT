package com.tayyaba;

import java.util.ArrayList;

public class DriverBook {

    public static void main(String[] args) throws InterruptedException {

       Subject s1=new Subject("Computing");
       Subject s2=new Subject("Humanities");
       Subject s3=new Subject("Science");
       Subject s4=new Subject("Engineering");
       Subject s5=new Subject("Mathematics");
       Subject s6=new Subject("SocialSciences");
//       Adding subjects to subjectList
       ArrayList<Subject> subjectList=new ArrayList<>();
       subjectList.add(s1);
       subjectList.add(s2);
       subjectList.add(s3);
       subjectList.add(s4);
       subjectList.add(s5);
       subjectList.add(s6);
//       Object of BookLab
        BookLab obj=new BookLab(subjectList);
        //Subjects only for BookLab Credentials holder
        obj.addSubjects();
        obj.displaySubjects();
        obj.showSelectedSubjectBooks();
    }
}