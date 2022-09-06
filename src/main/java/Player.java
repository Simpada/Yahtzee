import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {

    private final Dice[] dice;

    public int result(){

        int sum = 0;

        for (Dice dice : dice){
            sum += dice.getDescription();
        }
        return sum;
    }

    public Player(Dice[] dice) {
        this.dice = dice;
    }

    public String findPairs() {
        String result = "";

        Map<Value, List<Dice>> dieWithValue = new HashMap<>();

        for (Dice die: dice) {
            if (!dieWithValue.containsKey(die.getValue())) {
                dieWithValue.put(die.getValue(), new ArrayList<>());
            }
            dieWithValue.get(die.getValue()).add(die);
        }

        for (Value value : dieWithValue.keySet()) {
            if (dieWithValue.get(value).size() == 2) {
                return "pair of " + value.getValue();
            }
        }

        return result;
    }
}
