import java.util.Scanner;

public class Loops {
        public static void main(String[] args) {
                // for (int i = 0; i <= 10; i++) {
                // if (i == 1) {
                // System.out.println("Neither prime nor composite");
                // } else if (i < 1) {
                // System.out.println("Not prime");
                // } else if (i <= Math.sqrt(i)) {
                // System.out.println(i + "is Prime");
                // } else {
                // System.out.println("Prime");
                // }
                // }

                // Scanner sc = new Scanner(System.in);
                // System.out.println("Enter the value of n");
                // int n = sc.nextInt();
                // int sum = 0;
                // for (int i = 1; i <= n; i++) {
                // sum += i;
                // }
                // System.out.println("The sum of first" + n + "natural numbers is: " + sum);

                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();

                int i = 1;
                System.out.println("Table of 5:-");
                while (i <= 10) {
                        System.out.println(num * i);
                        i++;
                }
        }
}
