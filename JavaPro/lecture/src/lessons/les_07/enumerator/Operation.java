package lessons.les_07.enumerator;

public enum Operation {
    PLUS,
    MINUS,
    MULTI,
    DIVIDE;

    double calculate (double x, double y) {
        switch (this) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case MULTI:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
}
