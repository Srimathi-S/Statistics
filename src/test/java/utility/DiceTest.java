package utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiceTest {
    @Test
    void testIfProbabilityOfNotGetting1InADieIs0Dot83() {
        Dice dice = new Dice(Dice.DiceSide.One);
        Probability expectedProbability = new Probability(0.8333333333333333);

        Probability actualProbability = dice.probabilityOfNotOccurring();

        assertEquals(expectedProbability, actualProbability);
    }

}
