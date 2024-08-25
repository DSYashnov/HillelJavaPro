package hw_05.participant.obstacle;

public class Road extends  Obstacle{
    private int lenghts;

    public Road(int height) {
        this.lenghts = lenghts;
    }

    public int getLenghts() {
        return lenghts;
    }

    @Override
    public String toString() {
        return "Road{" +
                "lenghts=" + lenghts +
                '}';
    }
}
