import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

fun rockPaperScissors(s: String, s1: String): String {
    return "Player 1";
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

}
