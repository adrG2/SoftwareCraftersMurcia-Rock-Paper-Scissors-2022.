class RockPaperScissors {
    private val gameRules = mapOf(
        Moves.Rock to Moves.Paper,
        Moves.Paper to Moves.Scissors,
        Moves.Scissors to Moves.Rock,
    )

    fun rockPaperScissors(movePlayer1: Moves, movePlayer2: Moves): GameState  {
        if (movePlayer1 == movePlayer2) {
            return GameState.Draw
        }

        if (gameRules[movePlayer1] == movePlayer2) {
            return GameState.Player2
        }
        return GameState.Player1
    }
}
