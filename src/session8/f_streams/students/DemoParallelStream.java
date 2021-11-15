package session8.f_streams.students;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class DemoParallelStream {

    public static void main(String[] args) {

        List<String> names = Names.names;

        long start = System.currentTimeMillis();
        List<Student> students = names.stream().map(name -> {
                    try {
                        TimeUnit.MILLISECONDS.sleep(300);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    return new Student(name);
                }
        ).collect(Collectors.toList());


        long finish = System.currentTimeMillis();
        System.out.println(finish - start + " milliseconds");


    }
}
