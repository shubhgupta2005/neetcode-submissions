class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int l=0;
        int r=people.length-1;
        int count=0;
        while(l<=r){
            int wleft=limit-people[r];
            if(people[l]<=wleft){
                l++;
                

            }
            count++;
            r--;
            


        }
        return count;
        
    }
}