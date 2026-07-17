class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            pq.add(num);
        }
        while(pq.size()!=1){
            int a=pq.remove();
            int b=pq.remove();
            if(b<a){
                int cost=a-b;
                pq.add(cost);
            }else if(a<b){
                int cost=b-a;
                pq.add(cost);
            }else{
                continue;
            }
        }
        return pq.peek();


    }
}
