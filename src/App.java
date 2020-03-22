public class App {
    static boolean checkPrime(int number) {
        boolean status = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                status = false;
                break;
            }
        }
        return status;
    }

    public static void main(String[] args) {
        System.out.print("Prime < 100:");
        int n = 2;
        while (n < 100) {
            if (checkPrime(n)) {
                System.out.print(n + " ");
            }
            n++;
        }

    }
}
