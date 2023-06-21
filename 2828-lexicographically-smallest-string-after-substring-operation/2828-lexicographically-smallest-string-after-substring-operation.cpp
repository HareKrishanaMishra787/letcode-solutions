class Solution {
public:
    string smallestString(string s) {
        int n = s.size();bool flag = false;
        

        for(int i=0; i<n; i++){
            //If character 'a' is found and operation has been performed, break the loop
            //Else continue
            if(s[i] == 'a'){
                if(flag) break;
            }

            //If character other than 'a' just decrease it.
            else{
                s[i] = s[i]-1;
                flag = true;
            }
        }

        if(!flag) s[n-1] ='z';         
        return s;        
    }
};