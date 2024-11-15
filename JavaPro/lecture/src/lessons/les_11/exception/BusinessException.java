package lessons.les_11.exception;

public class BusinessException extends RuntimeException{
    public BusinessException (String message) {
        super(message);
    }
}
