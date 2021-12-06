package session6.b_lambda.c_filter_array;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Array {
    public static <T>  ArrayList<T> filter(ArrayList<T> array, Predicate<T> filterFunction){

        ArrayList<T> newarray =new ArrayList<T>();

        for (T element: array){
            if (filterFunction.test(element))
                newarray.add(element);
        }

        return newarray;
    }
}
