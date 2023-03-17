package exception;

/**
 * 类继承运行时异常RuntimeException，那么在编译时即使已有代码做出了抛出的准备，也不会提示报错
 * 只有在运行时会打印出你编写代码时的错误
 */
public class NotAdultPerson extends RuntimeException{
    public NotAdultPerson(){

    }

    public NotAdultPerson(String message){
        super(message);
    }
}
