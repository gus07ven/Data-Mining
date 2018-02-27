import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// ProgramManager class to control program flow from beginning to end.
public class ProgramManager {

    private int min_sup;
    private int k_size;
    private String input_file_path;
    private String output_file_path;


    public String getInput_file_path() {
        return input_file_path;
    }

    public String getOutput_file_path() {
        return output_file_path;
    }

    // First step: read and save command line arguments
    public void readCommandLineArgs(String args[]) {
        try {
            if(args.length != 4){
                System.out.println("Incorrect number of inputs entered.");
                System.out.println("Usage: java <min_sup> <input_transaction_file> <output_file_path>");
            } else {
                 min_sup = Integer.parseInt(args[0]);
                 k_size = Integer.parseInt(args[1]);
                 input_file_path = args[2];
                 output_file_path = args[3];

                 System.out.println("Min_sup is: " + min_sup);
                 System.out.println("K value is: " + k_size);
                 System.out.println("Input file path is: " + input_file_path);
                 System.out.println("Output file path is: " + output_file_path);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    // Second step: read and store transactions from input file.
    // TODO: Make store a different method?
    public void readInputFile(){
        try {
            File srcFile = new File(input_file_path);
            Scanner input = new Scanner(srcFile);
            Set<String> uniqueIds = new HashSet<String>();
            while(input.hasNext()){
                String idInput = input.next();
                uniqueIds.add(idInput);
                System.out.println(uniqueIds);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    // Receive results from algorithm and write to file
    public void writeOutputFile(String output_file_path){
        try {
            String pathAndFile = output_file_path + "AprioriResults";
//            System.out.println(pathAndFile);
            File outFile = new File(pathAndFile);

            // TODO: pass information from results instead of string here.
            String str = "Hello friend. Here are the results";
            BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
            writer.write(str);
            writer.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        ProgramManager programManager = new ProgramManager();
        programManager.readCommandLineArgs(args);
        programManager.readInputFile();
        //programManager.writeOutputFile("C:\\Users\\gustavo.arismendi\\IdeaProjects\\ProjectOne\\");
    }
}
