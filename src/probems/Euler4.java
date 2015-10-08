package probems;

/**
 * Created by : Luka
 * Date: 08/10/15
 */
public class Euler4 extends AbstractProblem {

    /*
    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
    Find the largest palindrome made from the product of two 3-digit numbers.
     */

    public Euler4() {
        super(4);
    }

    @Override
    public int problem() {
        int highest = 0;
        for(int i = 0 ; i < 1000 ; i++) {
            for(int z = 0 ; z < 1000; z++) {
                int sum = i*z;
               if(sum > highest) {
                   if(isPalli(sum)) {
                       highest = sum;
                   }
               }
            }
        }
        return highest;
    }

    private boolean isPalli(int number) {
        String num = Integer.toString(number);
        char[] chars = num.toCharArray();
        int size = chars.length-1;
        for(int i = 0 ; i <= size ; i++) {
            if(chars[i] != chars[size-i]) {
                return false;
            }
        }
        return true;
    }
}
