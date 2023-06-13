class Solution {
public:
    int climbStairs(int n) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        if(n==0) return 0;
        if(n==1) return 1;
        int one=1;
        int two=0;
        int result=0;
        for(int i=1;i<=n;i++){
            result=one+two;
            two=one;
            one=result;
        }
        return result;
    }
};