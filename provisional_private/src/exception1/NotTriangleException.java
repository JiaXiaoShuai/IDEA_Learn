package exception1;

public class NotTriangleException extends Exception{
    public NotTriangleException(){
    }

    public NotTriangleException(String message){
        super(message);
    }
}
