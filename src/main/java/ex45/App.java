package ex45;
import java.util.*;
import java.io.*;

/*
1. Get name of output file from user
2. Read the input file, replace "utilize" with "use" in the text
3. Output the modified text to specified output file
*/

public class App {

    public static void replace(Scanner input,FileWriter output) throws Exception
    {
        while(input.hasNext())
        {
            String line=input.nextLine();
            line=line.replaceAll("utilize","use");
            output.write(line);
            output.write("\n");
        }
    }

    public static String getFname()
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter output file name: ");
        String filename=input.next();
        input.close();
        return filename;
    }
    public static void main( String[] args )throws Exception
    {
        Scanner fInput= new Scanner(new File("exercise45_input.txt"));

        String filename=getFname();

        FileWriter output=new FileWriter(filename);

        replace(fInput, output);

        fInput.close();
        output.close();
    }
}
