package utility;

import java.util.Objects;

public class Probability {

    private final double probability;

    public Probability(double probability) {
        this.probability = probability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Probability)) return false;
        Probability probability = (Probability) o;
        return Double.compare(probability.probability, this.probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(probability);
    }
}
