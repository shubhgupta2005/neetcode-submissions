class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        List<List<String>>res=new ArrayList<>();

        for(String c :strs){
            char[] s=c.toCharArray();
            Arrays.sort(s);
            String sortedword=new String(s);
            if(!map.containsKey(sortedword)){
                map.put(sortedword,new ArrayList<>());
            }
                map.get(sortedword).add(c);
                

            
        }
        return new ArrayList<>(map.values());
        
    }
}
