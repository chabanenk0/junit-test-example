/**
 * Created by dmitry on 23.03.16.
 */

import java.util.LinkedList;

/**
 * Created by dmitry on 02.03.16.
 *
 * a0 +a1*x = 0
 * x = -a0 / a1
 */
public class LinearEquation {
    protected double a0;

    protected double a1;

    public double getA0() {
        return a0;
    }

    public void setA0(double a0) {
        this.a0 = a0;
    }

    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    LinkedList<Double> solve() throws Exception {
        LinkedList<Double> solution = new LinkedList<Double>();
        if (a1 != 0 ) {
            solution.add(-a0 / a1);
            return solution;
        } else {
            if (a0 == 0) {
                throw new Exception("Any real number");
            } else {
                throw new Exception("No real numbers solution");
            }
        }
    }
}
