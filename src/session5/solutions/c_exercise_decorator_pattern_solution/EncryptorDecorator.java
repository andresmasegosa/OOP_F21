package session5.solutions.c_exercise_decorator_pattern_solution;

public class EncryptorDecorator implements FileDataHandler{
    FileDataHandler fileDataHandler;
    DataEncryptor dataEncryptor;


    public EncryptorDecorator(FileDataHandler fileDataHandler, DataEncryptor dataEncryptor) {
        this.fileDataHandler = fileDataHandler;
        this.dataEncryptor = dataEncryptor;
    }

    @Override
    public void write(String data) {
        data = this.dataEncryptor.encryptData(data);
        fileDataHandler.write(data);
    }
}
