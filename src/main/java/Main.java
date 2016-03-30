/**
 * Created by dmitry on 23.03.16.
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        LinearEquation l = new LinearEquation();
        //* a0 +a1*x = 0
        l.setA0(1);
        l.setA1(1);
        System.out.println("Linear eq: a0 +a1*x = 0");
        try {
            System.out.println("x = " +l.solve());
        } catch (Exception e) {
            System.out.println("Solution error: " + e.getMessage());
        }
        System.out.println("end linear example...");
//        QuadraticEquation quadraticEquation = new QuadraticEquation();
        // 1 +2 x + 0x^2 = 0
        // (x-3)*(x+2) = x2 -x -6
//        quadraticEquation.setA0(-6);
//        quadraticEquation.setA1(-1);
//        quadraticEquation.setA2(1);
//        System.out.println("Quadratic eq: 1 +2 x + 0x^2 = 0");
//        try {
//            System.out.println("x = " +quadraticEquation.solve());
//        } catch (Exception e) {
//            System.out.println("Solution error: " + e.getMessage());
//        }
//        System.out.println("end quadratic example...");

    }
}

