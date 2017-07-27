import java.util.ArrayList;

class Number {
    Number() {
    }

    ArrayList<Integer> primeFactors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && isPrime(i))
                list.add(i);
        }
        return list;
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int k = (int) Math.sqrt(n);
        for (int i = 2; i <= k; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}