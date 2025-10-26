public class SwapNumbers {
    public static void main(String[] args) {
        float first = 12.0f, second = 24.5f;
        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        first = first - second;
        second = first + second;
        first = second - first;
        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
}
}
/*
--Before swap--
First number = 12.0
Second number = 24.5
--After swap--
First number = 24.5
Second number = 12.0
 */