import java.util.LinkedList;

/**
 * Created by dmitry on 30.03.16.
 */
public class QuadraticEquation extends LinearEquation{
    protected double a2;


    public double getA2() {
        return a2;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }

    public LinkedList<Double> solve() throws Exception {
        LinkedList<Double> solution = new LinkedList<Double>();
        if (a2 == 0) {
            return super.solve();
        } else {
            // ax2+ bx+c
            // a0 +a1*x + a2*x^2 = 0
            double a = a2;
            double b = a1;
            double c = a0;
            double d = b*b - 4*a*c;
            if (d < 0) {
                throw new Exception("No real solution but complex ones are possible");
            } {
                if (d == 0) {
                    solution.add((-b)/(2*a));
                } else {
                    solution.add((-b + Math.sqrt(d))/(2*a));
                    solution.add((-b - Math.sqrt(d))/(2*a));
                }
            }
        }
        return solution;
    }

}
