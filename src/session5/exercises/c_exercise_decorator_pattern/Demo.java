package session5.exercises.c_exercise_decorator_pattern;

public class Demo {
    public static void main(String[] args) {
        FileDataHandler fileDataHandler = new FileDataHandler("Demo.txt");
        fileDataHandler.write("Hola");
    }
}
