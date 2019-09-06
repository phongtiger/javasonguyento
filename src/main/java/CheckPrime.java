import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("The number n: ");
        int a = scanner.nextInt();

        if (isPrime(a)) {
            System.out.println("The number " + a + " is prime!");
        } else {
            System.out.println("The number " + a + " is not prime!");
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(number);
        for (int i = 2;i <= squareRoot;i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

