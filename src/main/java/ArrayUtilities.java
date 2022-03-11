import java.util.Random;

public class ArrayUtilities {
    //fill array with random numbers
    public static void fillArray(int[] arr){
        Random r = new Random();

        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt();
        }
    }

    //print all elements of array separated by space
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sortArray(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int begin, int end){
        int temp;
        int pivot = (begin + end) / 2;

        temp = arr[pivot];
        arr[pivot] = arr[end];
        arr[end] = temp;

        pivot = end;

        int i = begin, j = end - 1;
        boolean completed = false;

        while(!completed){
            while(arr[i] < arr[pivot]){
                i++;
            }
            while ((j >= 0) && (arr[pivot] < arr[j])){
                j--;
            }

            if(i<j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            } else{
                completed = true;
            }

        }

        temp = arr[i];
        arr[i] = arr[pivot];
        arr[pivot] = temp;

        if (begin < i - 1){
            quickSort(arr, begin, i - 1);
        }
        if (i + 1 < end){
            quickSort(arr, i + 1, end);
        }
    }
}
