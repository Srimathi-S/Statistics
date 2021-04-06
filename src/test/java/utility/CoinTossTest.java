package utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinTossTest {

    @Test
    public void testIsTrueForProbabilityOfHeadEqualsProbabilityOfTails() {
        CoinToss headsOnToss = new CoinToss(CoinToss.CoinSide.Heads);
        CoinToss tailsOnToss = new CoinToss(CoinToss.CoinSide.Tails);
        double headsProbability = headsOnToss.probability();
        double tailsProbability = tailsOnToss.probability();

        assertEquals(headsProbability, tailsProbability);
    }
}
