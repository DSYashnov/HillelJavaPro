package les_04.constructor;

public class Constructor {
    int a;
    int b;

    public Constructor(){

    }
    public Constructor (int a){
        System.out.println("Constructor : a");
        this.a = a;
    }
    public Constructor(int a, int b){
        this(a);
        System.out.println("Constructor : a, b");
        this.b = b;
    }

    void printParam(){
        System.out.println("a = " + a + "; b = " + b);
    }

}
