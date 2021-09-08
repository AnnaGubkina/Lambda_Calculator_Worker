package Calculator_Lambda;


import java.util.function.*;

public class Calculator {

    static Supplier instance;

    public Calculator() {
    }

    public static Supplier getInstance() {
        return instance;
    }

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    //необходимо реализовать проверку или будет исключение ArithmeticException
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y == 0)
            return 0;
        else
            return x / y;
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}
