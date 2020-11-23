

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sorting
{

    public static void main(String[] args) throws FileNotFoundException
    {
        File f = new File("SRC/Text/Text.txt");
        Scanner sc = new Scanner(f);
        String text = "";

       while (sc.hasNext()) { text = text + " " + sc.next().toLowerCase(); }

       String[] sorterText = text.split(" ");
       sortStrings(sorterText);
    }

    public static void sortStrings(String [] input)
    {
        for(int i = 0; i < input.length -1; i++)
        {
            int least = i;

            for(int j = i+1; j < input.length; j++)
            {
                if(input[j].compareTo(input[least]) < 1)
                {
                    least = j;
                }
            }
            swap(input, i, least);
        }

        for(String i : input)
        {
            System.out.println(i);
        }
    }

    public static void swap(String [] input, int i, int j)
    {
        String temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
