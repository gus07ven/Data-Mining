import java.io.*;
import java.util.*;

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
    public Set<String> readInputFileIntoSet(){
        Set<String> uniqueIds = new HashSet<String>();
        int counter = 0;
        try {
            File srcFile = new File(input_file_path);
            BufferedReader reader = new BufferedReader(new FileReader(srcFile));
            String line;

            while((line = reader.readLine()) != null) {
                Scanner input = new Scanner(line);
                while (input.hasNext()) {
                    String idInput = input.next();
                    uniqueIds.add(idInput);
                    counter++;
                    System.out.println(idInput);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(counter);
        System.out.println(uniqueIds);
        System.out.println(uniqueIds.size());
        return uniqueIds;
    }

    // Third step: Turn set into HashMap
    public Map<String, Integer> turnSetIntoHashMap(Set<String> uniqueIdSet){
        Map<String, Integer> idMap = new HashMap<>();
        int index = 0;
        for(String str : uniqueIdSet){
            idMap.put(str, index++);
        }
        System.out.println("Print map" + idMap);
        return idMap;
    }

    // Fourth step: Turn original uniqueIds into integers


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
        Set results = programManager.readInputFileIntoSet();
        Map results2 = programManager.turnSetIntoHashMap(results);
        System.out.println(results2.get("A251NMA8JPGYBL"));
        //programManager.writeOutputFile("C:\\Users\\gustavo.arismendi\\IdeaProjects\\ProjectOne\\");
    }
}
