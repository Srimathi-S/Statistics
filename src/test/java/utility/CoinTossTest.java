package utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinTossTest {

    @Test
    public void testIfProbabilityOfHeadEqualsProbabilityOfTails() {
        CoinToss headsOnToss = new CoinToss(CoinToss.CoinSide.Heads);
        CoinToss tailsOnToss = new CoinToss(CoinToss.CoinSide.Tails);

        Probability headsProbability = headsOnToss.probability();
        Probability tailsProbability = tailsOnToss.probability();

        assertEquals(headsProbability, tailsProbability);
    }

    @Test
    public void testIfProbabilityIsOneFourthForJointProbabilityOfHeadsAndTails() {
        CoinToss headsOnToss = new CoinToss(CoinToss.CoinSide.Heads);
        CoinToss tailsOnToss = new CoinToss(CoinToss.CoinSide.Tails);
        Probability expectedJointProbability = new Probability(0.25);

        Probability actualJointProbability = headsOnToss.jointProbability(tailsOnToss);

        assertEquals(expectedJointProbability, actualJointProbability);
    }

    @Test
    public void testIfProbabilityIsOneFourthForJointProbabilityOfHeadsAndHeads() {
        CoinToss headsOnToss = new CoinToss(CoinToss.CoinSide.Heads);
        Probability expectedJointProbability = new Probability(0.25);

        Probability actualJointProbability = headsOnToss.jointProbability(headsOnToss);

        assertEquals(expectedJointProbability, actualJointProbability);
    }
}
