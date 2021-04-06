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

    public double probability() {
        return coinSide.probability;
    }

}
