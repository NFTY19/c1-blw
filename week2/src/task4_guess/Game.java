package task4_guess;

public class Game {
    private int v = (int) (Math.random() * 100 + 1);

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    protected int guess (int x){
        if (x == this.v)    return 0;
        if (x > this.v)     return 1;
        else                return -1;
    }
}
