package stacKQueue.second;

import javafx.beans.property.*;

public class ResultEntry {
    private final StringProperty algorithm;
    private final IntegerProperty size;
    private final LongProperty time;

    public ResultEntry(String algorithm, int size, long time) {
        this.algorithm = new SimpleStringProperty(algorithm);
        this.size = new SimpleIntegerProperty(size);
        this.time = new SimpleLongProperty(time);
    }

    public String getAlgorithm() {
        return algorithm.get();
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm.set(algorithm);
    }

    public StringProperty algorithmProperty() {
        return algorithm;
    }

    public int getSize() {
        return size.get();
    }

    public void setSize(int size) {
        this.size.set(size);
    }

    public IntegerProperty sizeProperty() {
        return size;
    }

    public long getTime() {
        return time.get();
    }

    public void setTime(long time) {
        this.time.set(time);
    }

    public LongProperty timeProperty() {
        return time;
    }
}

