package session8;

import session6.b_lambda.c_filter_array.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class A {

    public void method(List<String> list){

        list.add("Hi!");

        for (String string: list){
            System.out.println(string);
        }

    }

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Andres");
        names.add("Thomas");

        A a = new A();

        a.method(names);

    }
}
