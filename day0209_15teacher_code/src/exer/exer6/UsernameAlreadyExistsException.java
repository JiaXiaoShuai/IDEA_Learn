package exer.exer6;

public class UsernameAlreadyExistsException extends Exception {
    public UsernameAlreadyExistsException() {
    }

    public UsernameAlreadyExistsException(String message) {
        super(message);
    }
}
