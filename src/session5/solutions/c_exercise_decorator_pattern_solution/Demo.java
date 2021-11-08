package session5.solutions.c_exercise_decorator_pattern_solution;


public class Demo {
    public static void main(String[] args) {
        FileDataHandler fileDataHandler = new FileDataHandlerImpl("Demo.txt");
        fileDataHandler.write("Hola");
        System.out.println();

        DataCompressor dataCompressor = new DataCompressor();
        FileDataHandler compressorDecorator = new CompressorDecorator(fileDataHandler,dataCompressor);
        compressorDecorator.write("Hola");
        System.out.println();

        DataEncryptor dataEncryptor = new DataEncryptor();
        FileDataHandler encryptorDecorator = new EncryptorDecorator(compressorDecorator, dataEncryptor);
        encryptorDecorator.write("Hola");
        System.out.println();
    }
}
