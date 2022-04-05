
public class Bowling {

    private int rollCount = 0;
    private int[] totalRolls = new int[21];

    public void roll(int...pins){
        for (int pin: pins)
            incrementRoll(pin);
    }
    public void incrementRoll(int pin){
        totalRolls[rollCount++]= pin;
    }
    public int score(){
        int score = 0;
        int count = 0;
        for (int i =0; i<10; i++){
            if(isStrike(count)){
                score +=10 + totalRolls[count+1] + totalRolls[count+2];
                count++;
            }
            else if (isSpare(count)){    //Spare
                score +=10 + totalRolls[count +1];
                count +=2;
            }else{
                score += totalRolls[count] + totalRolls[count+1];
                count +=2;
            }
        }
        return score;
    }
    public boolean isSpare(int count){
        return totalRolls[count] + totalRolls[count+1] ==10;
    }
    public boolean isStrike(int count){
        return totalRolls[count]  ==10;
    }
}

