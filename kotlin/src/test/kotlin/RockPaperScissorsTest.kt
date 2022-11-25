import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

class RockPaperScissorsTest {

    @TestFactory
    fun dynamicTestExample() = listOf(
        Triple(Moves.Rock, Moves.Scissors, GameState.Player1),
        Triple(Moves.Scissors, Moves.Rock, GameState.Player2),
        Triple(Moves.Paper, Moves.Rock, GameState.Player1),
        Triple(Moves.Rock, Moves.Paper, GameState.Player2),
        Triple(Moves.Scissors, Moves.Paper, GameState.Player1),
        Triple(Moves.Paper, Moves.Scissors, GameState.Player2),
        Triple(Moves.Rock, Moves.Rock, GameState.Draw),
        Triple(Moves.Paper, Moves.Paper, GameState.Draw),
        Triple(Moves.Scissors, Moves.Scissors, GameState.Draw),
    ).map { (movePlayer1, movePlayer2, expected) ->
        DynamicTest.dynamicTest("given I have chosen $movePlayer1 when the opponent chooses $movePlayer2 then $expected should win") {
            val game = RockPaperScissors()
            assertEquals(expected, game.rockPaperScissors(movePlayer1, movePlayer2))
        }
    }
}
