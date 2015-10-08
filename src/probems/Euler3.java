package probems;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by : Luka
 * Date: 08/10/15
 */
public class Euler3 extends AbstractProblem {

    /*
    The prime factors of 13195 are 5, 7, 13 and 29.
    What is the largest prime factor of the number 600851475143 ?
     */

    public Euler3() {
        super(3);
    }

    @Override
    public int problem() {
        double number = 600851475.143e3;

        ArrayList<Double> factors = getFactors(number);
        ArrayList<Double> secondaryFactors = new ArrayList<Double>();
        ArrayList<Double> thridFactors = new ArrayList<Double>();
        boolean uncomplete = true;

        while(uncomplete) {
            uncomplete = false;

            for(int i = 0; i < factors.size() ; i++) {
                double d = factors.get(i);
                ArrayList<Double> sf = getFactors(d);
                int s = sf.size();

                if(s == 0) {
                    if(!thridFactors.contains(d)) {
                        thridFactors.add(d);
                    }
                } else {
                    secondaryFactors.remove(d);
                    secondaryFactors.addAll(sf);

                    uncomplete = true;
                }
            }
            if(uncomplete) {
                factors.removeAll(thridFactors);
                factors = secondaryFactors;
            }
        }
        double largest = 0.0;
        for(Double doub : thridFactors) {
            if(doub > largest) {
                largest = doub;
            }
        }

        return (int) largest;
    }

    public ArrayList<Double> getFactors(double num) {
        ArrayList<Double> factors = new ArrayList<Double>();
        HashMap<Double, Double> doubles = new HashMap<Double, Double>();
        outerloop:for(double i = 2 ; i < num ; i++) {
            if(num % i == 0.0) {
                double numdiv = num/i;
                for(Double d : doubles.keySet()) {
                    if(d == numdiv) {
                        break outerloop;
                    }
                }
                doubles.put(i, numdiv);
            }
        }

        for(Double d: doubles.keySet()) {
            factors.add(d);
            factors.add(doubles.get(d));
        }
        return factors;
    }
}
