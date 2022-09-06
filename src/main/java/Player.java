public class Player {

    private final Dice[] dice;

    public int result(){

        int sum = 0;

        for (Dice dice : dice){
            sum += dice.getValue();
        }
        return sum;
    }

    public Player(Dice[] dice) {
        this.dice = dice;
    }
}
