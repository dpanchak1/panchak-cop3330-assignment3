package ex42;
import java.util.*;
import java.io.*;


/*
1. Read input from the input file as an ArrayList of strings
2. Parse the strings into the desired format and display to command line
*/

public class App {

    //reads the input file into an ArrayList
    public static void readInput(Scanner input, ArrayList<String> names)
    {
        while(input.hasNextLine())
        {
            names.add(input.nextLine());
        }
    }

    //parse the ArrayList into the desired format and print
    public static void parse(ArrayList<String> salary)
    {
        System.out.printf("%-10s%-10s%-10s\n","Last","First","Salary");
        System.out.print("--------------------------\n");
        for(String i:salary)
        {
            String[] temp = i.split(",");
            System.out.printf("%-10s%-10s%-10s\n", temp[0], temp[1], temp[2]);
        }

    }

    public static void main( String[] args ) throws Exception
    {
        Scanner input=new Scanner(new File("exercise42_input.txt"));
        ArrayList<String> salary= new ArrayList<>();
        readInput(input, salary);

        parse(salary);

        input.close();
    }

}
