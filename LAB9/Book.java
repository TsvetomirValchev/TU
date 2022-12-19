public class Book {

    private String title;
    private String author;
    private String ISBN;


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }



    public String getISBN() {
        return ISBN;
    }



    public Book (String title, String author, String ISBN)
    {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;

    }

    @Override
    public String toString()
    {
        return getTitle()+" by "+getAuthor()+" ISBN: "+ getISBN();

    }

}

