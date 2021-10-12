package ex41;
import java.io.*;
import java.util.*;


/*
1. Read input from the input file as an ArrayList of strings
2. Use Collections.sort to sort the strings alphabetically
3. Write the output to output file
*/
public class App 
{
    //reads input from file
    public static void readInput(Scanner input, ArrayList<String> names)
    {
        while(input.hasNextLine())
        {
            names.add(input.nextLine());
        }
    }

    //prints number of names and the list of names to output file
    public static void writeOutput(ArrayList<String> names) throws Exception
    {
        FileWriter output=new FileWriter("exercise41_output.txt");

        output.write("Total of " + names.size() + " names\n");
        output.write("-------------------\n");

        for(String i:names)
        {
            output.write(i+"\n");
        }
        output.close();
    }

    public static void main( String[] args ) throws Exception
    {
        //input file is specified here
        Scanner input=new Scanner(new File("exercise41_input.txt"));

        //create an ArrayList to hold names from the input file
        ArrayList<String> names= new ArrayList<>();
        readInput(input,names);

        Collections.sort(names,String.CASE_INSENSITIVE_ORDER);

        writeOutput(names);
        input.close();
    }
}
