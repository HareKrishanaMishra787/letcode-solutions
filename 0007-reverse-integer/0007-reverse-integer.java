class Solution {
    public int reverse(int x) {
        if (x == 0){ //if the number is zero then reverse will be zero
            return 0;
        }
        else{
            int flag = 1;
            if (x < 0){
                flag = -1;
                x = -x;
            }
            int result = 0;
            while(x > 0){
                int remaining_digit = x % 10;
                int newresult = result * 10 + remaining_digit; 
                if (result != (newresult - remaining_digit) / 10){
                    result = 0;
                    break;
                }
                result = newresult;
                x = x / 10;
            }
            result = result * flag;
            return result;
        }
    } 
}