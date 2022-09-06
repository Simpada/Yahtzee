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

    @Test
    void pairTest(){

        var player = new Player(new Dice[]{
                new Dice(Value.TWO),
                new Dice(Value.THREE),
                new Dice(Value.FOUR),
                new Dice(Value.ONE),
                new Dice(Value.ONE),
        });

        assertEquals("pair of 1", player.findPairs());

    }

    @Test
    void severalPairTest() {

        var player = new Player(new Dice[]{
                new Dice(Value.TWO),
                new Dice(Value.ONE),
                new Dice(Value.FOUR),
                new Dice(Value.ONE),
                new Dice(Value.TWO),
        });

        assertEquals("pair of 1, pair of 2", player.findPairs());


    }

}
