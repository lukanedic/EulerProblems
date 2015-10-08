import probems.*;

import java.util.ArrayList;

/**
 * Created by : Luka
 * Date: 08/10/15
 */
public class Euler {

    private static final ArrayList<AbstractProblem> eulers = new ArrayList<AbstractProblem>();

    static {
        eulers.add(new Euler1());
        eulers.add(new Euler2());
        eulers.add(new Euler3());
        eulers.add(new Euler4());
        eulers.add(new Euler5());
        eulers.add(new Euler6());
        eulers.add(new Euler7());
    }

    public static void main(String[] args) {
        for(AbstractProblem e : eulers) {
            e.run();
        }
    }

}
