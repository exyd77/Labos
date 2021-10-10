package Labos.src;

public class FizzBuzz {

    final static int MAX = 200;

    public static void main(String[] args) {
        int counter = 1;

        while (counter <= MAX) {

            if ((counter % 3 == 0) && (counter % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (counter % 5 == 0) {
                System.out.println("Buzz");
            } else if (counter % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(counter);
            }

            counter++;
        }

    }
}