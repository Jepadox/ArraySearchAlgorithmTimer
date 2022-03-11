import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args){
        Random r = new Random();
        String outputFileName = "searchTimes.csv";
        PrintWriter output = null;
        int[] numbers;
        int value;
        long startTime;
        long sequentialTime;

        try{
            output = new PrintWriter(new FileWriter(outputFileName));
        } catch(IOException ex){
            System.exit(1);
        }

        //search method return values ignored, only interested in timing algorithms
        for(int i = 50000; i <= 50000; i+=1000){
            //i used for array size to search arrays of varying sizes
            numbers = new int[i];
            ArrayUtilities.fillArray(numbers);
            //generate value to search for
            value = r.nextInt();

            //sequential search time
            startTime = System.nanoTime();
            SearchAlgorithms.sequentialSearch(numbers, value);
            sequentialTime = System.nanoTime() - startTime;

            output.println(i + "," + sequentialTime);
        }

        output.close();
    }
}
