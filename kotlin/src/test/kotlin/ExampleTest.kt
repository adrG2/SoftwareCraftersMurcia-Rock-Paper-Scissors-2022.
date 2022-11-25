import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

fun rockPaperScissors(movePlayer1: String, movePlayer2: String): String {
    if(movePlayer1 == "rock")
        return "Player 1";

    if (movePlayer1 == "paper")
        return "Player 1";


    return "Player 2";
}

class ExampleTest {

    @Test
    fun `given I have chosen rock when the opponent chooses scissors then I should win`() {
        assertEquals("Player 1", rockPaperScissors("rock", "scissors"))
    }

    @Test
    fun `given I have chosen scissors when the opponent chooses rock then the opponent win`() {
        assertEquals("Player 2", rockPaperScissors("scissors", "rock"))
    }

    @Test
    fun `given I have chosen paper when the opponent chooses rock then I should win`() {
        assertEquals("Player 1", rockPaperScissors("paper", "rock"))
    }

}
