import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


enum class GameState {
    Player1,
    Player2
}

enum class Moves {
    Rock,
    Paper,
    Scissors
}

fun rockPaperScissors(movePlayer1: Moves, movePlayer2: Moves): GameState = when {
    movePlayer1 == Moves.Rock && movePlayer2 == Moves.Paper -> GameState.Player2
    movePlayer1 == Moves.Rock -> GameState.Player1
    movePlayer1 == Moves.Paper -> GameState.Player1
    else -> GameState.Player2
}

class RockPaperScissorsTest {

    @Test
    fun `given I have chosen rock when the opponent chooses scissors then I should win`() {
        assertEquals(GameState.Player1, rockPaperScissors(Moves.Rock, Moves.Scissors))
    }

    @Test
    fun `given I have chosen scissors when the opponent chooses rock then the opponent win`() {
        assertEquals(GameState.Player2, rockPaperScissors(Moves.Scissors, Moves.Rock))
    }

    @Test
    fun `given I have chosen paper when the opponent chooses rock then I should win`() {
        assertEquals(GameState.Player1, rockPaperScissors(Moves.Paper, Moves.Rock))
    }

    @Test
    fun `given I have chosen rock when the opponent chooses paper then I should win`() {
        assertEquals(GameState.Player2, rockPaperScissors(Moves.Rock, Moves.Paper))
    }

}
