public class Dice {

    private final Value value;

    public Value getValue() {
        return value;
    }

    public Dice(Value value) {
        this.value = value;
    }

    public int getDescription(){
        return value.getValue();
    }
}
