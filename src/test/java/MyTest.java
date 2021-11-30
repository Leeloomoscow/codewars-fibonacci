import org.junit.jupiter.api.Test;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void testSomething() {
        assertEquals(1, Fibonacci.fib(1));
        assertEquals(1, Fibonacci.fib(2));
        assertEquals(2, Fibonacci.fib(3));
        assertEquals(3, Fibonacci.fib(4));
        assertEquals(5, Fibonacci.fib(5));

    }

    private static class Fibonacci {
        public static long fib(int n) {

            long x = 1;
            long y = 1;
            for (int i = 2; i < n; i++) {
                y = x + y;
                x = y - x;
            }
            return y;

//           или рекурсия, но не очень вариант:
//            if (n <= 1) {
//                return 1;
//            } else if (n == 2) {
//                return 1;
//            } else {
//                return fib(n - 1) + fib(n - 2);
//  или
//            double square = sqrt(5);
//            double phi = (1 + square)/2;
//            long l = (int) (pow(phi, n) / square + 0.5);
//            return l;
        }
    }
}



