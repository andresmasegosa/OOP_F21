package session6.b_lambda.a_inverter;

public  class Demo {

    public static double invertAndAddOne(Inverter f, double x) {
        return f.invert(x)+ 1.0;
    }

    public static void main(String[] args) {
        Inverter inverter = new DivisionInverter();
        double result = invertAndAddOne(inverter, 42.0);
        System.out.println(result);

        result = invertAndAddOne(x -> 1./x, 42.0);
        System.out.println(result);

        // Exercise: Implements the inverter f(x) = 1/(x*x+10) using lambda expressions.

        Inverter inverter1 = x -> 1/(x*x+10);

        result = invertAndAddOne(inverter1, 42.0);
        System.out.println(result);


    }

}

