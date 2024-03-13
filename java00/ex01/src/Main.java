//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class Main {
    public static void main(String[] args)
    {
        int num;
        int i;
        int b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        num = scanner.nextInt();
        scanner.close();
        if (num <= 0 || num == 1 )
        {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        else
        {
            i = 2;
            b = -3;
            while (i <= sqrt(num))
            {
                if ((num % i) == 0)
                {
                    System.out.println("flase " + i);
                    System.exit(0);
                }
                i++;
            }
            System.out.println("true " + i);
        }

    }
}