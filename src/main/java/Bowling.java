
public class Bowling {

    private int score = 0;
    public void roll(int...pins){
        for (int pin: pins)
            score +=pin;
    }
    public int score(){
        return score;
    }
}

