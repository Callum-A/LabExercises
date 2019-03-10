
package LabSheetFour;

/**
 * @author Callum Anderson
 * @version 1.0
 */

public class Main {

    /*
    Write a static method called isPrime, that takes an integer
    argument and returns true if the argument is prime and false otherwise.
     */

    private static boolean isPrime(int n){

        for(int i = 2; i < n; i++){

            if(n % i == 0){

                return false;

            }

        }

        return true;

    }

    public static void main(String[] args) {

        System.out.println(isPrime(33));

    }

}
