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
        long startTime, sequentialTime, sortedTime, binaryTime;

        try{
            output = new PrintWriter(new FileWriter(outputFileName));
        } catch(IOException ex){
            System.exit(1);
        }

        //search method return values ignored, only interested in timing algorithms
        for(int i = 50000; i <= 500000; i+=1000){
            //i used for array size to search arrays of varying sizes
            numbers = new int[i];
            ArrayUtilities.fillArray(numbers);
            //generate value to search for
            value = r.nextInt();

            //sequential search time
            startTime = System.nanoTime();
            SearchAlgorithms.sequentialSearch(numbers, value);
            sequentialTime = System.nanoTime() - startTime;

            //sort before setting start time to not include sort time in results
            ArrayUtilities.sortArray(numbers);

            //sorted search time
            startTime = System.nanoTime();
            SearchAlgorithms.sortedSearch(numbers, value);
            sortedTime = System.nanoTime() - startTime;

            //binary search time
            startTime = System.nanoTime();
            SearchAlgorithms.binarySearch(numbers, value);
            binaryTime = System.nanoTime() - startTime;

            output.println(i + "," + sequentialTime + "," + sortedTime + "," + binaryTime);
        }

        output.close();
    }
}
