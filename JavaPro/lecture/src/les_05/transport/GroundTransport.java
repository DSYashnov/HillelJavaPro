package les_05.transport;

public class GroundTransport extends Transport{
    private int countWheal;

    public GroundTransport (String name){
        super(name);
    }

    public int getCountWheal() {
        return countWheal;
    }

    public void setCountWheal(int countWheal) {
        this.countWheal = countWheal;
    }
}
