import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class yahtzeeTest {

    @Test
    public void highestSumTest() {

        //var result = new Player().result;
        var sum = new Player().getSum();

        assertEquals(10, sum);

    }

}
