package probems;

/**
 * Created by : Luka
 * Date: 08/10/15
 */
public abstract class AbstractProblem {

    private final int num;

    public AbstractProblem(int num) {
        this.num = num;
    }

    public abstract int problem();

    public void run() {
        System.out.println("Euler Problem " + num + " = " + problem());
    }

}
