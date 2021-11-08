package session6.b_lambda.c_filter_array;

import java.util.ArrayList;

public class DemoIntegerArray {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            array.add(i);
        }

        ArrayList<Integer> filteredArray = Array.filter(array, integer -> integer%2==0);

        for (Integer integer: filteredArray){
            System.out.println(integer);
        }
    }
}
