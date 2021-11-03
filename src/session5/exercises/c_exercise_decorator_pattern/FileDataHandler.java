package session5.exercises.c_exercise_decorator_pattern;

public class FileDataHandler {
    String fileName;

    public FileDataHandler(String fileName) {
        this.fileName = fileName;
    }

    public void write(String data){
        System.out.println("Writing Data: "+data);
    }

}
