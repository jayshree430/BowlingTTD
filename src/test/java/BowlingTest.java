import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class BowlingTest {
    Bowling game;

    @BeforeEach
    public void setup(){
        game=new Bowling();
    }
    @Test
    public void checkAllRollsAreZero(){
        game.roll(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        Assertions.assertEquals(0, game.score());
    }

    @Test
    public void checkAllRollsAreOnes(){
        game.roll(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);
        Assertions.assertEquals(20, game.score());
    }
    @Test
    public void checkAllRollsAre9FollowedByAMiss(){
        game.roll(9,9,9,9,9,9,9,9,9,9);
        Assertions.assertEquals(90, game.score());

    }
}
