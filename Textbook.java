public class Textbook extends Book{
    private int editionNum;
    public Textbook(String bookTitle, double bookPrice, int ed){
        super(bookTitle, bookPrice);
        editionNum = ed;
    }

    @Override public String getBookInfo(){
        return super.getBookInfo() + "-" + editionNum ;
    }

    public int getEdition(){
        return editionNum;
    }

    public boolean canSubstituteFor(Textbook other){
        String otherTitle = other.getTitle();
        String currentTitle = this.getTitle();
        if(otherTitle == currentTitle){
            if(other.getEdition() <= this.getEdition()){
                return true;
            }
        }
        return false;
    }
}