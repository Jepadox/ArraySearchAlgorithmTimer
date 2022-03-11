public class SearchAlgorithms {

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
