package utility;

public class CoinToss extends Probability {

    public enum CoinSide {
        Tails(0.5), Heads(0.5);

        private final double probability;

        CoinSide(double probability) {
            this.probability = probability;
        }
    }

    private final CoinSide coinSide;

    public CoinToss(CoinSide coinSide) {
        super(coinSide.probability);
        this.coinSide = coinSide;
    }

    public Probability occursTogether(CoinToss coinToss) {
        if (coinToss.coinSide != this.coinSide) return new Probability(this.probability);
        return new Probability(coinToss.probability * this.probability);
    }

}
