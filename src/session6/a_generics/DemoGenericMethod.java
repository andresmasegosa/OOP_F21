package session6.a_generics;

import java.util.Date;

public class DemoGenericMethod {

    public static <T> T identity(T t) {
        return t;
    }

    public static <T> T head(T[] a) {
        if (a.length == 0) {
            return null;
        }
        return a[0];
    }

    public static void main(String[] args) {
        double x = identity(42.0);
        String y = identity("Hello World");


        String s = head(new String[] {"hello", "world"});
        Date d = head(new Date[]{ new Date() });
    }
}
