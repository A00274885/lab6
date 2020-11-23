
public class Book
{
    public String title;
    public String author;
    public String publisher;
    public double price;
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

    public static void bookSorter(Book[] books, int choice)
    {
        switch (choice)
        {
            case 1:
                for (int i = 0; i < books.length -1; i++)
                {
                    int least = i;

                    for (int j = i + 1; j < books.length; j++)
                    {
                        if (books[j].title.compareTo(books[least].title) < 0)
                        {
                            least = j;
                        }
                    }
                    swap(books, i,least);
                }
            break;

            case 2:
            {
                for (int i = 0; i < books.length - 1; i++)
                {
                    int least = i;

                    for (int j = i + 1; j < books.length; j++)
                    {
                        if (books[j].author.compareTo(books[least].author) < 0)
                        {
                            least = j;
                        }
                    }
                    swap(books,i,least);
                }
            break;
            }

            case 3:
            {
                for (int i = 0; i < books.length - 1; i++)
                {
                    int least = i;

                    for (int j = i + 1; j < books.length; j++)
                    {
                        if (books[j].publisher.compareTo(books[least].publisher) < 0)
                        {
                            least = j;
                        }
                    }
                    swap(books,i,least);
                }
            break;
            }

            case 4:
            {
                for (int i = 0; i < books.length - 1; i++)
                {
                    int least = i;

                    for (int j = i + 1; j < books.length; j++)
                    {
                        if (books[j].price < books[least].price)
                        {
                            least = j;
                        }
                    }
                    swap(books, i,least);
                }
            break;
            }
        }
    }

    public static void swap(Book [] input, int i, int j)
    {
        Book temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    public void PrintInfo()
    {
        System.out.print("Title= " + title + " Author= " + author + " Publisher= " + publisher + " Price= " + price );
    }
    public static void PrintArrayInfo(Book[] books)
    {
        for (int i = 0; i < books.length;i++)
        {
            System.out.println("Title: " + books[i].title);
            System.out.println("Author: "+ books[i].author);
            System.out.println("Publisher: "+ books[i].publisher);
            System.out.println("price: "+ books[i].price);
            System.out.println();
        }
    }
}
