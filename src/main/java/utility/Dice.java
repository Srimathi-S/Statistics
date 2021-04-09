package utility;

public class Dice extends Probability {

    public enum DiceSide {
        One(0.1666666666666667),
        Two(0.1666666666666667),
        Three(0.1666666666666667),
        Four(0.1666666666666667),
        Five(0.1666666666666667),
        Six(0.1666666666666667);

        private final double probability;

        DiceSide(double probability) {
            this.probability = probability;
        }
    }

    public Dice(DiceSide diceSide) {
        super(diceSide.probability);
    }

}
