package probems;

import java.util.ArrayList;

/**
 * Created by : Luka
 * Date: 08/10/15
 */
public class Euler7 extends AbstractProblem {

    /*
        By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
        What is the 10 001st prime number?
     */

    public Euler7() {
        super(7);
    }

    @Override
    public int problem() {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int i = 1;
        int counter = 1;
        boolean prime;

        while(counter <= 10001) {
            i++;
            prime = true;
            for(Integer z : primes) {
                if(i % z == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime) {
                counter++;
                primes.add(i);
            }
        }

        return i;
    }
}
