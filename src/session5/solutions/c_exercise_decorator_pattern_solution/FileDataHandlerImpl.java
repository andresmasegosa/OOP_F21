package session5.solutions.c_exercise_decorator_pattern_solution;

public class FileDataHandlerImpl implements FileDataHandler {
    String fileName;

    public FileDataHandlerImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void write(String data){
        System.out.println("Writing Data: "+data);
    }

}
