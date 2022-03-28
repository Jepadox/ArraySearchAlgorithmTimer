public class SearchAlgorithms {

    public static boolean binarySearch(int[] arr, int x){
        boolean found = false;
        int first = 0;
        int last = arr.length - 1;
        int pivot;

        while(first <= last && !found){
            pivot = (first + last) / 2;

            if(arr[pivot] == x){
                found = true;
            }
            else{
                if(arr[pivot] < x){
                    first = pivot+1;
                }
                else{
                    last = pivot-1;
                }
            }
        }
        return found;
    }
    //sequential search returning true if found
    public static boolean sequentialSearch(int[] arr, int x){
        boolean found = false;

        for(int num : arr){
            //if x is found in arr, end search
            if(num == x){
                found = true;
                break;
            }
        }

        return found;
    }

    //variation of sequential search used on sorted array
    public static boolean sortedSearch(int[] arr, int x){
        boolean found = false;
        int i = 0;

        while(i < arr.length && arr[i] < x){
            if(arr[i] == x){
                found = true;
                break;
            }
            i++;
        }

        return found;
    }

}
