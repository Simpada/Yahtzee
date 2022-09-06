public class Dice {

    private final Value value;

    public Dice(Value value) {
        this.value = value;
    }

    public int getValue(){
        return value.getValue();
    }
}
