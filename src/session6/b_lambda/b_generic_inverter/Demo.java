package session6.b_lambda.b_generic_inverter;

import java.util.function.Function;

public  class Demo {

    public static double invertAndAddOne(Function<Double,Double> f, double x) {
        return f.apply(x)+ 1.0;
    }

    public static void main(String[] args) {
        double result = invertAndAddOne(x -> 1./x, 42.0);
        System.out.println(result);

        // Exercise: Implements the inverter f(x) = 1/(x*x+10) using lambda expressions.

    }

}

