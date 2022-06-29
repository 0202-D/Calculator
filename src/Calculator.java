import java.util.function.*;

/**
 * @author Dm.Petrov
 * DATE: 29.06.2022
 */
public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    // Здесь была возможна ошибка приделении но ноль. Так же можно было бы завернуть этот блок в try catch
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y == 0) {
            return -666666666;
        } else {
            return x / y;
        }
    };
    //Вот такой вариант возможен
    BinaryOperator<Double> devideDouble = (x, y) -> {
        if (y == 0) {
            return Double.POSITIVE_INFINITY;
        } else {
            return x / y;
        }
    };
    UnaryOperator<Integer> pow = x -> x * x;

    UnaryOperator<Integer> abs = x ->
            x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Double> printlnDouble = System.out::println;
    Consumer<Integer> println = System.out::println;
}
