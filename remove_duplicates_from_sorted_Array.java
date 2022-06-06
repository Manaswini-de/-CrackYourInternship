
/**
 * remove_duplicates_from_sorted_Array
 */
public class remove_duplicates_from_sorted_Array {

    class Solution {
        public int removeDuplicates(int[] arr) {
            int i=0, j=1;
            
            while(j<arr.length){
                if(arr[j] == arr[i]){
                    j++;
                }
                else{
                    //swap i and j, increment both
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                    j++;
                }
            }
            
            return i+1;
        }
    }
}