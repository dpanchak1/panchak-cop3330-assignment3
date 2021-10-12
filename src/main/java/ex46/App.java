package ex46;
import java.util.*;
import java.io.*;

/*
1. Read input file into the map
2. Display the histogram based on the frequency of words in the input file
*/

public class App {

    public static void readInput(Scanner input, Map<String,Integer> tree)
    {
        while(input.hasNext())
        {
            String temp= input.next();
            if(tree.containsKey(temp))
            {
                tree.put(temp,tree.get(temp)+1);
            }
            else
            {
                tree.put(temp,1);
            }
        }
    }

    public static void printHistogram(Map<String,Integer> tree)
    {
        for(String i:tree.keySet())
        {
            System.out.printf("%-10s",i+":");
            for(int j=tree.get(i);j>0;j--)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main( String[] args) throws Exception
    {
        Scanner fInput= new Scanner(new File("exercise46_input.txt"));
        Map<String,Integer> tree= new TreeMap<>();

        readInput(fInput,tree);

        printHistogram(tree);
    }
}
