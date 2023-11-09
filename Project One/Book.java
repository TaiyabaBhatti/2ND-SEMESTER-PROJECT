package com.tayyaba;
public class Book extends BookPrototype{
    Book(String bookName) {
        this.bookName = bookName;
        readBook();
    }
    public void readBook() {
        switch (bookName) {
            case "Anthropology" -> {
                bookAuthor = "Rohn jin";
                authorBelongs = "Singapore";
                issueOn = 2007;
                System.out.println(this);
            }
            case "Business" -> {
                bookAuthor = "Mrliqe";
                authorBelongs = "France";
                issueOn = 1890;
                System.out.println(this);
            }
            case "Communication" -> {
                bookAuthor = "Consita merry";
                authorBelongs = "Morroco";
                issueOn = 2009;
                System.out.println(this);
            }
            case "Economics" -> {
                bookAuthor = "Herbelam ";
                authorBelongs = "Afganistan";
                issueOn = 1990;
                System.out.println(this);
            }
            case "Education" -> {
                bookAuthor = "pitcho buz";
                authorBelongs = "Thailand";
                issueOn = 1909;
                System.out.println(this);
            }
            case "Geography" -> {
                bookAuthor = "Comber joe";
                authorBelongs = "NewZ";
                issueOn = 1897;
                System.out.println(this);
            }
            case "History of SocialSciences" -> {
                bookAuthor = "Hanliki";
                authorBelongs = "Russia";
                issueOn = 1809;
                System.out.println(this);
            }
            case "Law of SS" -> {
                bookAuthor = "Melspeep";
                authorBelongs = "Ankara";
                issueOn = 2007;
                System.out.println(this);
            }
            case "Linguistics" -> {
                bookAuthor = "Petter";
                authorBelongs = "Ireland";
                issueOn = 1999;
                System.out.println(this);
            }
            case "Political science" -> {
                bookAuthor = "Telsen nesla";
                authorBelongs = "Bahrain";
                issueOn = 2003;
                System.out.println(this);
            }
            case "Psychology" -> {
                bookAuthor = "Jen Nieect";
                authorBelongs = "Ottawa";
                issueOn = 2005;
                System.out.println(this);
            }
            case "Computer hardware" -> {
                bookAuthor = "Rohn jin";
                authorBelongs = "Malysia";
                issueOn = 2007;
                System.out.println(this);
            }
            case "Computer networking" -> {
                bookAuthor = "Mrliqee";
                authorBelongs = "Itlay";
                issueOn = 1890;
                System.out.println(this);
            }
            case "Computer programming" -> {
                bookAuthor = "Merry John";
                authorBelongs = "Morroco";
                issueOn = 2009;
                System.out.println(this);
            }
            case "Computer science" -> {
                bookAuthor = "Herbelam ";
                authorBelongs = "Kabul";
                issueOn = 1990;
                System.out.println(this);
            }
            case "Computer software" -> {
                bookAuthor = "pitcho buz";
                authorBelongs = "Thailand";
                issueOn = 1909;
                System.out.println(this);
            }
            case "History of Computation" -> {
                bookAuthor = "Comber joe";
                authorBelongs = "NewZ";
                issueOn = 1897;
                System.out.println(this);
            }
            case "Information technology" -> {
                bookAuthor = "Hanliki";
                authorBelongs = "Russia";
                issueOn = 1809;
                System.out.println(this);
            }
            case "Internet" -> {
                bookAuthor = "Melspeep";
                authorBelongs = "Ankara";
                issueOn = 2007;
                System.out.println(this);
            }
            case "Open source" -> {
                bookAuthor = "Petter";
                authorBelongs = "Ireland";
                issueOn = 1999;
                System.out.println(this);
            }
            case "Fine arts" -> {
                bookAuthor = "Yonkun ";
                authorBelongs = "China";
                issueOn = 1992;
                System.out.println(this);
            }
            case "History of Arts" -> {
                bookAuthor = "pitcho buz";
                authorBelongs = "Thailand";
                issueOn = 1909;
                System.out.println(this);
            }
            case "Literature" -> {
                bookAuthor = "Comber soe";
                authorBelongs = "NewZ";
                issueOn = 1897;
                System.out.println(this);
            }
            case "Performing arts" -> {
                bookAuthor = "Dichard";
                authorBelongs = "Russia";
                issueOn = 1809;
                System.out.println(this);
            }
            case "Philosophy" -> {
                bookAuthor = "Rose min";
                authorBelongs = "Ankara";
                issueOn = 2007;
                System.out.println(this);
            }
            case "Religion" -> {
                bookAuthor = "Petter";
                authorBelongs = "Ireland";
                issueOn = 1999;
                System.out.println(this);
            }
            case "Law of Humanity" -> {
                bookAuthor = "Ronchied";
                authorBelongs = "Ireland";
                issueOn = 1999;
                System.out.println(this);
            }
            case "Health sciences" -> {
                bookAuthor = "Pikata";
                authorBelongs = "NewZ";
                issueOn = 1897;
                System.out.println(this);
            }
            case "Life sciences" -> {
                bookAuthor = "Hanliki roy";
                authorBelongs = "Russia";
                issueOn = 1809;
                System.out.println(this);
            }
            case "Physical sciences" -> {
                bookAuthor = "Nilmii";
                authorBelongs = "Rabat";
                issueOn = 2007;
                System.out.println(this);
            }
            case "Science study guides" -> {
                bookAuthor = "Petter jin";
                authorBelongs = "Ireland";
                issueOn = 1999;
                System.out.println(this);
            }
            case "Biomedical engineering" -> {
                bookAuthor = "Buzyy Noie";
                authorBelongs = "Netherland";
                issueOn = 1900;
                System.out.println(this);
            }
            case "Chemical engineering" -> {
                bookAuthor = "Comber joe";
                authorBelongs = "New";
                issueOn = 1897;
                System.out.println(this);
            }
            case "Civil engineering" -> {
                bookAuthor = "Rinchird";
                authorBelongs = "Russia";
                issueOn = 2001;
                System.out.println(this);
            }
            case "Electrical engineering" -> {
                bookAuthor = "Melspeep henry";
                authorBelongs = "Ankara";
                issueOn = 2007;
                System.out.println(this);
            }
            case "General engineering" -> {
                bookAuthor = "Melburn";
                authorBelongs = "Canada";
                issueOn = 1939;
                System.out.println(this);
            }
            case "Materials engineering" -> {
                bookAuthor = "Combin joe";
                authorBelongs = "NewZ";
                issueOn = 1897;
                System.out.println(this);
            }
            case "Mechanical engineering" -> {
                bookAuthor = "Helma kin";
                authorBelongs = "Tokyo";
                issueOn = 2000;
                System.out.println(this);
            }
            case "Nuclear engineering" -> {
                bookAuthor = "rinbo kin";
                authorBelongs = "Ankara";
                issueOn = 2007;
                System.out.println(this);
            }
            case "Systems engineering" -> {
                bookAuthor = "Nortan";
                authorBelongs = "Morrocco";
                issueOn = 1909;
                System.out.println(this);
            }
            case "Elementary arithmetic" -> {
                bookAuthor = "Helmin";
                authorBelongs = "NewZ";
                issueOn = 1897;
                System.out.println(this);
            }
            case "K-12 mathematics" -> {
                bookAuthor = "Urhi nam";
                authorBelongs = "Zimbabe";
                issueOn = 1800;
                System.out.println(this);
            }
            case "Mathematical collections" -> {
                bookAuthor = "Nelson shuo";
                authorBelongs = "Ankara";
                issueOn = 2007;
                System.out.println(this);
            }
            case "Mathematical references" -> {
                bookAuthor = "Koin si";
                authorBelongs = "Tokyo";
                issueOn = 1909;
                System.out.println(this);
            }
            case "Mathematics history" -> {
                bookAuthor = "linr joe";
                authorBelongs = "NewZ";
                issueOn = 1897;
                System.out.println(this);
            }
            case "Mathematics study guides" -> {
                bookAuthor = "Hanry ham";
                authorBelongs = "Italy";
                issueOn = 2002;
                System.out.println(this);
            }
            case "Pure mathematics" -> {
                bookAuthor = "Sivin Ram";
                authorBelongs = "Ankara";
                issueOn = 2007;
                System.out.println(this);
            }
            case "University level mathematics books" -> {
                bookAuthor = "Petter joe";
                authorBelongs = "Bankok";
                issueOn = 1900;
                System.out.println(this);
            }
            case "Applied mathematics" -> {
                bookAuthor = "Mohib kamran";
                authorBelongs = "Ireland";
                issueOn = 1999;
                System.out.println(this);
            }
            case "The Wandering Falcon" -> {
                bookAuthor = "Mohsin Hamid";
                authorBelongs = "Pakistan";
                issueOn = 2005;
                System.out.println(this);
            }
            case "Seasons Of the Rain Birds" -> {
                bookAuthor = "Nadeem Aslam";
                authorBelongs = "Pakistan";
                issueOn = 2006;
                System.out.println(this);
            }
            case "Butterfly Dreams" -> {
                bookAuthor = "Anne Mcclard";
                authorBelongs = "North Africa";
                issueOn = 1909;
                System.out.println(this);
            }
            case "Little Women" -> {
                bookAuthor = "Louisa May Alcott";
                authorBelongs = "Ireland";
                issueOn = 1898;
                System.out.println(this);
            }
            case "The Nation of Politicians" -> {
                bookAuthor = "Padhraig Higgins";
                authorBelongs = "WashingTon";
                issueOn = 1999;
                System.out.println(this);
            }
            case "The Truth about Patriotism" -> {
                bookAuthor = "Steven Johnston";
                authorBelongs = "Paris";
                issueOn = 2007;
                System.out.println(this);
            }
            case "The Battle of Belonging" -> {
                bookAuthor = "Shashi Tharoor";
                authorBelongs = "India";
                issueOn = 2003;
                System.out.println(this);
            }
            case "The Last Refuge" -> {
                bookAuthor = "David W. Orr";
                authorBelongs = "Canada";
                issueOn = 1899;
                System.out.println(this);
            }
            case "Kargil" -> {
                bookAuthor = "Rachna Bisht Rawat";
                authorBelongs = "India";
                issueOn = 1989;
                System.out.println(this);
            }
            case "Design and Build Web Sites" -> {
                bookAuthor = "Jon Duckett";
                authorBelongs = "Dubai";
                issueOn = 2011;
                System.out.println(this);
            }
            case "The Definitive Guide" -> {
                bookAuthor = "David Flanagan";
                authorBelongs = "Iran";
                issueOn = 1909;
                System.out.println(this);
            }
            case "Eloquent Javascript" -> {
                bookAuthor = "Marijn Haverbake";
                authorBelongs = "Tehran";
                issueOn = 1899;
                System.out.println(this);
            }
            case "Don't Make Me Think" -> {
                bookAuthor = "Steve Krug";
                authorBelongs = "America";
                issueOn = 2013;
                System.out.println(this);
            }
            case "Rocket Propulsion Elements" -> {
                bookAuthor = "George P. Sutton";
                authorBelongs = "Brazil";
                issueOn = 2019;
                System.out.println(this);
            }
            case "Aircraft structures" -> {
                bookAuthor = "David J. Peery";
                authorBelongs = "NetherLand";
                issueOn = 1899;
                System.out.println(this);
            }
            case "The Wright Brothers" -> {
                bookAuthor = "David McCullough";
                authorBelongs = "Ottawa";
                issueOn = 1909;
                System.out.println(this);
            }
            case "Urdu" -> {
                bookAuthor = "Nawab karan ";
                authorBelongs = "Pakistan";
                issueOn = 1909;
                System.out.println(this);
            }
            case "English" -> {
                bookAuthor = "Komal Rizwi";
                authorBelongs = "India";
                issueOn = 1959;
                System.out.println(this);
            }
            case "French" -> {
                bookAuthor = "Roi Feran";
                authorBelongs = "Russia";
                issueOn = 1969;
                System.out.println(this);
            }
            case "Balochi" -> {
                bookAuthor = "Rabela Rahim";
                authorBelongs = "Pakistan";
                issueOn = 1969;
                System.out.println(this);
            }
            default -> System.out.println("No new Updates...");
        }
    }
        public String toString() {
            return "\t\t\t\t\t\t\t\t\t\t\t\t\t" + "Book Name: " + bookName + "\n\t\t\t\t\t\t\t\t\t\t\t\t\t" + "Book Author: " + bookAuthor + "\n\t\t\t\t\t\t\t\t\t\t\t\t\t" + "Author Belongs: " + authorBelongs + "\n\t\t\t\t\t\t\t\t\t\t\t\t\t" + "Date Of Issue: " + issueOn;
        }

    }

