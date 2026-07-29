class Solution {

    public String encode(List<String> strs) {
        StringBuilder s=new StringBuilder();
        for(String ch : strs){
            s.append(ch.length()).append('#').append(ch);

        }
        return s.toString();


    }

    public List<String> decode(String str) {
        List<String>res=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;

            }
            int len=Integer.parseInt(str.substring(i,j));
            i=j+1;
            j=i+len;
            res.add(str.substring(i,j));
            i=j;
        }
        return res;

    }
}
