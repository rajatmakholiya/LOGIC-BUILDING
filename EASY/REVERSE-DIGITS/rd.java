class Solution {
    public int reverseDigit(int n){
        return Integer.parseInt(new StringBuilder(Integer.toString(n)).reverse().toString());
    }
}

class Main {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.reverseDigit(1234));
    }
}