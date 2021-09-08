package Calculator_Lambda;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {


        Supplier<Calculator> instance = Calculator::new;

        Calculator calc = instance.get();

        int mult = calc.multiply.apply(10, 25);
        int pow = calc.pow.apply(6);


        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);

        calc.println.accept(mult);
        calc.println.accept(pow);
        calc.println.accept(a);
        calc.println.accept(b);

        calc.println.accept(c);

    }
}
