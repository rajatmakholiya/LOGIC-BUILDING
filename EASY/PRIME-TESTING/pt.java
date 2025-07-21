class Solution{
    public boolean isPrime(int n){
        if (n<=1) return false;
        for (int i= 2; i <= Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}

public class pt{
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.print("Enter a number: ");
        int n = new java.util.Scanner(System.in).nextInt();
        System.out.println(s1.isPrime(n) ? "Prime" : "Not Prime");
    }

}