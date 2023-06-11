import java.util.Scanner;

public class Home {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                float r = sc.nextFloat();
                double area = 3.14 * r * r;
                System.out.println("the area of the circle is:");
                System.out.print(area);
        }
}
