package probems;

/**
 * Created by : Luka
 * Date: 08/10/15
 */
public class Euler5 extends AbstractProblem {

    /*
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     */

    public Euler5() {
        super(5);
    }

    @Override
    public int problem() {

        boolean div = true;
        int num = 20;

        while(div) {
            div = false;
            for(int i = 1; i < 20 ; i++) {
                if(num % i != 0) {
                    num+=20;
                    div = true;
                    break;
                }
            }
        }

        return (int) num;
    }
}
