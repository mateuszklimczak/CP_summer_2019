public class PrimeNumbers_1 {
    public static void main(String[] args) {



        for (int j = 2; j < 100; j++) {
            boolean isPrime = true;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    // System.out.println(j + " " + "is not a prime number");
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {

                System.out.println(j + " " + "is a prime number");


            }
        }
    }
}
