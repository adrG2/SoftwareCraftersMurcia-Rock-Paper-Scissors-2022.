class RockPaperScissors {
    private val gameRules = mapOf(
        Moves.Rock to Moves.Paper,
        Moves.Paper to Moves.Scissors,
        Moves.Scissors to Moves.Rock,
    )

    fun rockPaperScissors(movePlayer1: Moves, movePlayer2: Moves): GameState = when {
        movePlayer1 == movePlayer2 -> GameState.Draw
        gameRules[movePlayer1] == movePlayer2 -> GameState.Player2
        else -> GameState.Player1
    }
}
