package les_06.interfaces.logExample;

public class User implements Logger{
    private String fullName;

    @Override
    public String xxx() {
        System.out.println("nothing do...");
        return null;
    }

    @Override
    public void printLog(String msg) {
        System.out.println("User : " + fullName + "...." + msg);
    }
}
