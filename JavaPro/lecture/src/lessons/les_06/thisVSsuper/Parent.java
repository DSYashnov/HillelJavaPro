package lessons.les_06.thisVSsuper;

public class Parent {
    private String fName;
    private String lName;

    public Parent(String fName, String lName) {
        System.out.println("parent : (fName, lName)");
        this.fName = fName;
        this.lName = lName;
    }
    public Parent () {
        System.out.println("parent : ()");
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}
