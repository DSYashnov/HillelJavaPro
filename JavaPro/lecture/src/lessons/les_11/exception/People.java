package lessons.les_11.exception;

public class People {
    void print() throws Exception {
        throw new BusinessException ("Business Exception");
    }
}
