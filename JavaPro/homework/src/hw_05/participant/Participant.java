package hw_05.participant;

public class Participant {

    private String name;
    private int jump;
    private int run;

    public Participant(String name, int jump, int run) {
        this.name = name;
        this.jump = jump;
        this.run = run;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", jump=" + jump +
                ", run=" + run +
                '}';
    }
}
