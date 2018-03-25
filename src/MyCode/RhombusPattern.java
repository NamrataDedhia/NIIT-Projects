package MyCode;

public class RhombusPattern {

	public static void main(String[] args) {
		int a, i, j, count = 1;
        a = 5;
        count = a - 1;
        for (i = 1; i <= a; i++)
        {
            for (j = 1; j <= count; j++)
                System.out.print(" ");
            count--;
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        count = 1;
        for (i = 1; i <= a - 1; i++)
        {
            for (j = 1; j <= count; j++)
                System.out.print(" ");
            count++;
            for (j = 1; j <= 2 * (a - i) - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}