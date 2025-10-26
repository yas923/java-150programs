import java.math.BigInteger;
public class FactorialBigInt{
    public static void main(String[] args) {
        int num = 30;
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
/*
 Factorial of 30 = 265252859812191058636308480000000
 */