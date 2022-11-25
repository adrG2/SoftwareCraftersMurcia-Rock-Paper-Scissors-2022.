import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory


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
    movePlayer1 == Moves.Rock && movePlayer2 == Moves.Scissors-> GameState.Player1
    movePlayer1 == Moves.Paper && movePlayer2 == Moves.Rock -> GameState.Player1
    movePlayer1 == Moves.Paper && movePlayer2 == Moves.Scissors -> GameState.Player2
    movePlayer1 == Moves.Scissors && movePlayer2 == Moves.Paper -> GameState.Player1
    else -> GameState.Player2
}

class RockPaperScissorsTest {

    @TestFactory
    fun dynamicTestExample() = listOf(
        Triple(Moves.Rock, Moves.Scissors, GameState.Player1),
        Triple(Moves.Scissors, Moves.Rock, GameState.Player2),
        Triple(Moves.Paper, Moves.Rock, GameState.Player1),
        Triple(Moves.Rock, Moves.Paper, GameState.Player2),
        Triple(Moves.Scissors, Moves.Paper, GameState.Player1),
        Triple(Moves.Paper, Moves.Scissors, GameState.Player2),
    ).map { (movePlayer1, movePlayer2, expected) ->
        DynamicTest.dynamicTest("given I have chosen $movePlayer1 when the opponent chooses $movePlayer2 then $expected should win") {
            assertEquals(expected, rockPaperScissors(movePlayer1, movePlayer2))
        }
    }
}
