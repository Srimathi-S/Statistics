package utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinTossTest {

    @Test
    public void testIsProbabilityOfHeadEqualsProbabilityOfTails() {
        CoinToss headsOnToss = new CoinToss(CoinToss.CoinSide.Heads);
        CoinToss tailsOnToss = new CoinToss(CoinToss.CoinSide.Tails);

        Probability headsProbability = headsOnToss.probability();
        Probability tailsProbability = tailsOnToss.probability();

        assertEquals(headsProbability, tailsProbability);
    }
}
