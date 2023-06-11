public class Prime {
        public static void main(String[] args) {
                for (int i = 0; i <= 10; i++) {
                        if (i == 1) {
                                System.out.println(i + " is Neither prime or composite");
                        } else if (isPrime(i)) {
                                System.out.println(i + " is prime");
                        } else {
                                System.out.println(i + " is not prime");
                        }
                }
        }

        public static boolean isPrime(int num) {
                if (num <= 1) {
                        return false;
                }
                for (int i = 2; i <= Math.sqrt(num); i++) {
                        if (num % i == 0) {
                                return false;
                        }
                }
                return true;
        }
}
