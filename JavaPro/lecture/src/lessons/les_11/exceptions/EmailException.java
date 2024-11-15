package lessons.les_11.exceptions;

public class EmailException extends RuntimeException{
    public EmailException (String message) {
        super(message);
    }
}
