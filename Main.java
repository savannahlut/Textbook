public class Main{
    public static void main(String[] args)
    {
        Textbook bio2015 = new Textbook("Biology", 49.75, 2) ;
        Textbook bio2019 = new Textbook("Biology", 39.75, 3) ;
        System.out.println(bio2019.getEdition());
        System.out.println(bio2019.getBookInfo());
        System.out.println(bio2019.canSubstituteFor(bio2015));
        System.out.println(bio2015.canSubstituteFor(bio2019));

        Textbook math = new Textbook("Calculus", 45.25, 1);
        System.out.println(bio2015.canSubstituteFor(math));

        System.out.println("My Test Case: ");
        Textbook csa2008 = new Textbook("AP Computer Science", 37.85, 5); 
        Textbook csa2007 = new Textbook("AP Computer Science", 46.65, 4); 
        System.out.println(csa2008.canSubstituteFor(csa2007)); // should return true
        System.out.println(csa2007.canSubstituteFor(csa2008)); // should return false
    }
}