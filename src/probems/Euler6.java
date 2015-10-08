package probems;

/**
 * Created by : Luka
 * Date: 08/10/15
 */
public class Euler6 extends AbstractProblem {
/*
    The sum of the squares of the first ten natural numbers is,
        12 + 22 + ... + 102 = 385
    The square of the sum of the first ten natural numbers is,
        (1 + 2 + ... + 10)2 = 552 = 3025
    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

    public Euler6() {
        super(6);
    }

    @Override
    public int problem() {
        int tot = 0;
        int sum = 0;
        int dif = 0;

        for(int i = 0 ; i < 101; i++) {
            tot+=i;
            sum+= Math.pow(i,2);
        }
        dif = (int)Math.pow(tot,2)-sum;
        return dif;
    }
}
