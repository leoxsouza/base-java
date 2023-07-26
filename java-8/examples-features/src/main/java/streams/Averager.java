package streams;

import java.util.function.IntConsumer;

public class Averager implements IntConsumer {

    private int total = 0;
    private int count = 0;

    public double average() {
        return count > 0 ? ((double) total)/count : 0;
    }

    @Override
    public void accept(int value) {
        total += value;
        count++;
    }

    public void combine(Averager other) {
        total += other.total;
        count += other.count;
    }
}
