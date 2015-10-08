package probems;

/**
 * Created by : Luka
 * Date: 08/10/15
 */
public class Euler1 extends AbstractProblem {

    /*
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    Find the sum of all the multiples of 3 or 5 below 1000.
     */

    public Euler1() {
        super(1);
    }

    @Override
    public int problem() {
        int sum = 0;
        for(int i = 0; i < 1000 ; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
