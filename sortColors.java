public class sortColors {
    class Solution {
        public void sortColors(int[] arr) {
            
            // 0 to j-1 -> 0's region
            // j to i-1 -> 1's region
            // i to k -> unknowns
            // k+1 to n-1 -> 2's region
            
            int i = 0;
            int j = 0;
            int k = arr.length-1;
            
            while(i <= k){
                if(arr[i] == 1){
                    i++;
                }
                else if(arr[i] == 0){
                    //swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                    i++;
                    j++;
                }
                else{
                    // swap arr[i] and arr[k]
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                    
                    k--;
                }
            }
            
        }
    }
}
