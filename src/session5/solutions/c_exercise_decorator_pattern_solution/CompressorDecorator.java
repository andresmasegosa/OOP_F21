package session5.solutions.c_exercise_decorator_pattern_solution;

public class CompressorDecorator implements FileDataHandler{
    FileDataHandler fileDataHandler;
    DataCompressor compressor;


    public CompressorDecorator(FileDataHandler fileDataHandler, DataCompressor compressor) {
        this.fileDataHandler = fileDataHandler;
        this.compressor = compressor;
    }

    @Override
    public void write(String data) {
        data = this.compressor.compressData(data);
        fileDataHandler.write(data);
    }
}
