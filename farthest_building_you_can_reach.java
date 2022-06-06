class Solution {
   
    public int furthestBuilding(int[] hts, int bricks, int ladders) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long mjsum=0;
        long bct=0;
        int ans = -1;
        
        for(int i=0; i<hts.length-1; i++){
            int diff = hts[i+1] - hts[i];
            
            if(pq.size()<ladders){
                if(diff > 0){
                    pq.add(diff);
                    mjsum+= diff;
                } 
            }
            else if(ladders > 0 && pq.peek() < diff){
                int rem = pq.remove();
                mjsum-=rem;
                mjsum+= diff;
                pq.add(diff);
            }
            
            if(diff > 0){
                bct+= diff;
            }
            
            // System.out.println(bct+ " " + mjsum);
            
            if(bct - mjsum > bricks){
                ans = i;
                return ans;
             
            }
        }
        
        return hts.length-1;
    }
}

















