package utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinTossTest {

    @Test
    public void testIfProbabilityOfHeadEqualsProbabilityOfTails() {
        CoinToss headsOnToss = new CoinToss(CoinToss.CoinSide.Heads);
        CoinToss tailsOnToss = new CoinToss(CoinToss.CoinSide.Tails);

        assertEquals(headsOnToss,tailsOnToss);
    }

    @Test
    public void testIfProbabilityIsHalfForOccurrenceOfHeadsAndTailsTogether() {
        CoinToss headsOnToss = new CoinToss(CoinToss.CoinSide.Heads);
        CoinToss tailsOnToss = new CoinToss(CoinToss.CoinSide.Tails);
        Probability expectedProbability = new Probability(0.5);

        Probability actualProbability = headsOnToss.occursTogether(tailsOnToss);

        assertEquals(expectedProbability, actualProbability);
    }

    @Test
    public void testIfProbabilityIsOneFourthForOccurrenceOfHeadsAndHeadsTogether() {
        CoinToss headsOnToss = new CoinToss(CoinToss.CoinSide.Heads);
        Probability expectedProbability = new Probability(0.25);

        Probability actualProbability = (headsOnToss.occursTogether(headsOnToss));

        assertEquals(expectedProbability, actualProbability);
    }

}
