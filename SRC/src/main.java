import java.io.FileNotFoundException;

public class main
{
    public static void main(String[] args) throws FileNotFoundException
    {

        Book[] bookArray = new Book[7];

        bookArray[0] = new Book ("The Lion the witch and the wardrobe ","C.S Lewis","Geoffrey Bles",1);

        bookArray[1] = new Book("The Communist Manifesto","Karl Marx","The USSR", 0);

        bookArray[2] = new Book("Harry Potter and the philosophers stone","Daniel Radcliffe","Bloomsbury", 10);

        bookArray[3] = new Book("The Alchemist", "Paulo Coelho","Harper Torch", 5);

        bookArray[4] = new Book("Charlottes Web","EB White","Bloomsbury",15);

        bookArray[5] = new Book("The Great Gatsby","F.Scott", "Charles Scribners Sons", 18);

        bookArray[6] = new Book("Nineteen eighty-four", "George Orwell","Secker and Warburg",90);

        Book.bookSorter(bookArray,1);
        Book.PrintArrayInfo(bookArray);
    }
}
