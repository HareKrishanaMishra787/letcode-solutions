import java.util.HashMap;

class Solution {
    public boolean isFascinating(int n) {
        return checkFascinatingNumber(n);
    }
    
    private boolean checkFascinatingNumber(int n) {
        int m = n * 2;
        int o = n * 3;
        String number = String.valueOf(n) + String.valueOf(m) + String.valueOf(o);
        HashMap<Character, Integer> digitCount = new HashMap<>();
        
        for (char digit : number.toCharArray()) {
            if (digit != '0') {
                digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
                if (digitCount.get(digit) > 1) {
                    return false;
                }
            }
        }
        
        return digitCount.size() == 9;
    }
}
