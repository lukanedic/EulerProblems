package probems;

/**
 * Created by : Luka
 * Date: 08/10/15
 */
public class Euler2 extends AbstractProblem {

    /*
    Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
    By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
     */

    public Euler2() {
        super(2);
    }

    @Override
    public int problem() {
        int counter = 0;
        int previous = 1;
        int sum = 0;
        while(counter < 4000000) {
            if(counter % 2 == 0) {
                sum+= counter;
            }
            int c = counter;
            counter += previous;
            previous = c;
        }
        return sum;
    }
}