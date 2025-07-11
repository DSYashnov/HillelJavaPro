package lessons.les_25.reflection;

import java.lang.reflect.Constructor;

public class ClassGetConstructor {
    public static void main(String[] args) throws ClassNotFoundException{
        //Baz baz = new Baz("2", 2);

        //Class<?> = Class.forName("lessons.les_25.reflection.Baz");

        Class cls = Baz.class;

        //only public

        Constructor[] constructors = cls.getConstructors();
        // for get public constructors
//        for (Constructor constructor : constructors) {
//            System.out.println();
//            System.out.println(constructor);
//            Class<?> params = constructor.getParameterTypes();
//            for (Class<?> param : params) {
//                System.out.println(param.getName());
//                System.out.println(param.getTypeName());
//            }
//        }
        //all
        System.out.println();
        //for get public and private constructors
        constructors = cls.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println();
            System.out.println(constructor);
            System.out.println(constructor.getModifiers());
            Class<?>[] params = constructor.getParameterTypes();
            for (Class<?> param : params) {
                System.out.println(param.getName());
            }
        }
    }
    class Baz {
        private String val1;
        private Integer val2;

        public Baz(String val1, Integer val2) {
            this.val1 = val1;
            this.val2 = val2;
        }
        protected Baz (String val1) {
            this.val1 = val1;
        }
        private Baz(Integer  val2) {
            this.val2 = val2;
        }
        public Baz() {

        }
    }
}
