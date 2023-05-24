import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 13; i++) {
            System.out.print(i + ":");
            System.out.println(isPrimes(i));
        }
    }

    public static String factors(int n) {
        List<String> factors = new ArrayList<>();
        int divisor = 2;
        while (n < 1) {
            if ((n % divisor == 0) && isPrimes(divisor)) {
                int count = 0;
                while (n % divisor == 0) {
                    n = n / divisor;
                    count++;
                }

                factors.add(count > 1 ? "(" + divisor + "**" + count + ")" : "(" + divisor + ")");

            }
divisor++;

        }


        return String.join("", factors);
    }


    static boolean isPrimes(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}