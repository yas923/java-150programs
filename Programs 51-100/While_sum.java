public class While_sum{
    public static void main(String[] args) {
        int num = 50, i = 1, sum = 0;
        while(i <= num)
        {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}
/*
Sum = 1275
 */