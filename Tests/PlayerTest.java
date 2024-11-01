package Tests;

import org.junit.jupiter.api.Test;
import src.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {
    @Test
    void getScore() {
        Player playerInstance = new Player(1);
        int score = playerInstance.GetTotalScore();
        assertEquals(0, score);
    }

    @Test
    void setScore() {
        Player playerInstance = new Player(1);
        int testScore = 150;
        playerInstance.SetScore(testScore);
        int score = playerInstance.GetTotalScore();
        assertEquals(10, score);
    }
}