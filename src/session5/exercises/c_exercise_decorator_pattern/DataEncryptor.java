package session5.exercises.c_exercise_decorator_pattern;

public class DataEncryptor {
    public String encryptData(String data) {
        System.out.println("Encrypting data");
        return data+"_encrypted";
    }
}
