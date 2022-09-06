import java.util.*;

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

        for (Value value : Value.values()) {
            if (dieWithValue.containsKey(value) && dieWithValue.get(value).size() == 2) {
                if(!result.isEmpty()){
                    result += ", ";
                }
                result += "pair of " + value.getValue();
            }
        }

        return result;
    }
}
