package utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinTest {

    @Test
    public void testIsTrueForProbabilityOfHeadEqualsProbabilityOfTails() {
        Coin coin = new Coin();

        double headsProbability = coin.probability(Coin.CoinSide.Heads);
        double tailsProbability = coin.probability(Coin.CoinSide.Tails);

        assertEquals(headsProbability, tailsProbability);
    }
}
