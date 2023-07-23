package Numbers;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        System.out.println(isPrime(49)); // true
        System.out.println(isPrime(2)); // false
    }

    public static boolean isPrime(int n) {
        if (n == 0) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
