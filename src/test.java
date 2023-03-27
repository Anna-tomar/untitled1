import java.util.Scanner;
 class Test {
        public static int power(int x, int n) {
            if (n >= 1) {
                return x * power(x, n - 1);
            } else {
                return 1;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(power(x, n));
        }
    }


