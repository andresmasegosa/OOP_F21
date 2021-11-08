package session5.solutions.c_exercise_decorator_pattern_solution;

public class DataEncryptor {
    public String encryptData(String data) {
        System.out.println("Encrypting data");
        return data+"_encrypted";
    }
}
