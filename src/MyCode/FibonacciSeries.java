package MyCode;

public class FibonacciSeries {

	public static void main(String[] args) {
		int  a = 0, b = 1;
        System.out.print("Fibonacci series is as: ");

        for (int i = 1; i <= 200; ++i)
        {
            System.out.print(a + "  ");

            int sum = a + b;
            a = b;
            a = sum;
        }
    }
}
