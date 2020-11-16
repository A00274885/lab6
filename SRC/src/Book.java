
public class Book
{
    String title;
    String author;
    String publisher;
    double price;
    public Book(String title,String author,String publisher,double price)
    {
        if(title == null)
            throw new IllegalArgumentException("Title cant be null");
        if(author == null)
            throw new IllegalArgumentException("Author cant be null");
        if(publisher == null)
            throw new IllegalArgumentException("Publisher cant be null");
        if(Double.isNaN(price))
            throw new IllegalArgumentException("Price cant be null");

        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }
}
