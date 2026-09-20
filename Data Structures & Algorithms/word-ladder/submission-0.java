class Pair{
    String first;
    int second;
    Pair(String first, int second){
        this.first=first;
        this.second=second;

    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        Set<String> st=new HashSet<String>();
        int len=wordList.size();
        for(int i=0;i<len;i++){
            st.add(wordList.get(i));
        }
        st.remove(beginWord);
        while(!q.isEmpty()){
            String word=q.peek().first;
            int steps=q.peek().second;
            q.remove();
            if(word.equals(endWord)==true) return steps;
            for(int i=0;i<word.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char rca[]=word.toCharArray();
                    rca[i]=ch;
                    String rw=new String(rca);
                    if(st.contains(rw)==true){
                        st.remove(rw);
                        q.add(new Pair(rw,steps+1));
                    }
                }
            }
        }
        return 0;

        
    }
}
