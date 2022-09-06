import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class yahtzeeTest {

    @Test
    public void chanceTest() {

        var player = new Player(new Dice[]{
                new Dice(Value.TWO),
                new Dice(Value.THREE),
                new Dice(Value.FOUR),
                new Dice(Value.FIVE),
                new Dice(Value.ONE),
        });

        assertEquals(15, player.result());
    }


}
