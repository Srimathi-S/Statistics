package utility;

public class CoinToss {

    public enum CoinSide {
        Tails(0.5), Heads(0.5);

        private final double probability;

        CoinSide(double probability) {
            this.probability = probability;
        }
    }

    private final CoinSide coinSide;

    public CoinToss(CoinSide coinSide) {
        this.coinSide = coinSide;
    }

    public Probability probability() {
        return new Probability(coinSide.probability);
    }

    public Probability jointProbability(CoinToss coinToss) {
        return new Probability(coinToss.coinSide.probability * coinSide.probability);
    }

}
