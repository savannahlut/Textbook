public class Book{
    private String title;
    private double price;
    public Book(String bookTitle, double bookPrice){
        title = bookTitle;
        price = bookPrice;
    }
    public String getTitle(){
        return title;
    }
    public String getBookInfo(){
        return title + "-" + price;
    }
}
public class Textbook extends Book{
    private int editionNum;
    public Textbook(String bookTitle, double bookPrice, int ed){
        super(bookTitle, bookPrice);
        editionNum = ed;

    }

    public booelan canSubstituteFor(){
        /* to implement */
    }
}