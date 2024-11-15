package lessons.les_07.enumerator;

public class EnumeratorRun {
    public static void main(String[] args) {
        Enumerator1 e1 = new Enumerator1("test@gmai.com");

        System.out.println(e1);

        e1.setStatus(Enumerator.ACTIVE);

        System.out.println(e1);

        System.out.println(e1.isActive());

        e1.setActive(isActive(e1));
        System.out.println(isActive(e1));

        setActiveStatus(e1);

        System.out.println(e1);

    }

    public static void setActiveStatus (Enumerator1 enumerator) {
        if (enumerator.getStatus().equals(Enumerator.ACTIVE)) {
            enumerator.setActive(true);
        }
        System.out.println(enumerator.isActive());
    }
    public static boolean isActive(Enumerator1 enumerator1) {
        return enumerator1.getStatus().equals(Enumerator.ACTIVE);
    }

}
