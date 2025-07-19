public class sod {
    public int sumOfDigits(int n) {
        int sum = 0;
        for (char s : Integer.toString(n).toCharArray()) {
            sum += s - '0'; // Convert char to int
        }
        return sum;
    }

    public static void main(String[] args) {
        sod s1 = new sod();
        System.out.println(s1.sumOfDigits(1234));
    }
}