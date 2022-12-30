package exer.exer5;

public class UsernameAlreadyExistsException extends Exception{
    public UsernameAlreadyExistsException() {
        super();
    }

    public UsernameAlreadyExistsException(String message) {
        super(message);
    }
}
