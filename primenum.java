import java.util.Scanner;
public class primenum extends nextprime {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int num;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=s.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        int count = 0;
        int numberToCheck = num + 1; // Start checking from the next number
        System.out.println("The next 10 prime numbers after " + num + " are:");
        while (count < 10) {
            if (isPrime(numberToCheck)) {
                System.out.println(numberToCheck);
                count++;
            }
            numberToCheck++;
        }
    }
    }
