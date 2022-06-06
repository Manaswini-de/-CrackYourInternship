import java.util.*;
class Solution {
    public class Pair implements Comparable<Pair>{
        int ele;
        int frq;
        
        Pair(int ele, int frq){
            this.ele = ele;
            this.frq = frq;
        }
        
        public int compareTo(Pair o){
            return this.frq - o.frq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            int nf = map.getOrDefault(nums[i],0)+1;
            map.put(nums[i], nf);
        }
        
        for(int key : map.keySet()){
            int freq = map.get(key);
            
            if(pq.size()<k){
                pq.add(new Pair(key,freq));
            }
            else if(pq.peek().frq < freq){
                pq.remove();
                pq.add(new Pair(key,freq));
            }
        }
        
        int ans[] = new int[k];
        int idx = 0;
        
        while(pq.size()>0){
            ans[idx] = pq.remove().ele;
            idx++;
        }
        
        return ans;
        
    }
}