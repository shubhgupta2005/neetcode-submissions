class Solution {
public:
    int evalRPN(vector<string>& st) {
        stack<int> s;
        for(int i=0;i<st.size();i++){
            
            if (st[i] != "+" && st[i] != "-" && st[i] != "*" && st[i] != "/"){
                s.push(stoi(st[i]));

            }else{
                int ch1=s.top();s.pop();
                int ch2=s.top();s.pop();
                if(st[i]=="+") {
                    int eval=ch1+ch2;
                    s.push(eval);
                }
                if(st[i]=="*"){
                    int eval=ch1*ch2;
                    s.push(eval);
                }
                if(st[i]=="/"){
                    
                    if(ch2==0){
                        
                        s.push(0);
                    }
                    s.push(ch2/ch1);
                }
                if(st[i]=="-"){
                    int eval=ch2-ch1;
                    s.push(eval);
                }
            }
        }
        return s.top();
        
    }
};
