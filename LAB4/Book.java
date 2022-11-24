public class Book {

    String title;
    String author;
    String publisher;
    int publishingYear;
    String ISBN;


    public Book(String title, String author, String publisher, int publishingYear, String ISBN) throws WrongISBNException{
        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
        setPublishingYear(publishingYear);
        setISBN(ISBN);
    }




    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) throws WrongISBNException{

        if(ISBN.length() == 10) {
            this.ISBN = ISBN;
        }
        else {
            throw new WrongISBNException();
        }
    }

    @Override
    public String toString() {
        return getTitle() +" "+getAuthor()+" "+getPublisher()+" "+getPublishingYear()+" "+getISBN();
    }
}
