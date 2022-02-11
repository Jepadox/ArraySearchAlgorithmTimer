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
}
