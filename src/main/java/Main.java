public class Main {
    public Integer digital_root(int n) {
        if (n < 10) {
            return n;
        }

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        return digital_root(sum);
    }
}