/**
 * @author Dm.Petrov
 * DATE: 29.06.2022
 */
public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int cc = calc.devide.apply(a, b);
        calc.println.accept(cc);
        double c = calc.devideDouble.apply((double) a, (double) b);
        calc.printlnDouble.accept(c);
        int d = calc.abs.apply(-5);
        calc.println.accept(d);
        int e = calc.pow.apply(4);
        calc.println.accept(e);
        System.out.println(calc.isPositive.test(-3));
    }
}
