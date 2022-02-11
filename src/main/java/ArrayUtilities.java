import java.util.Random;

public class ArrayUtilities {
    //fill array with random numbers
    public static void fillArray(int[] arr){
        Random r = new Random();

        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt();
        }
    }
}
