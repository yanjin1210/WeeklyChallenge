object RockPaperScissor extends App{

  def rps(player1: String, player2: String): String = {
    if (player1 == player2) return "TIE"
    val p1Wins = "Player 1 wins"
    val p2Wins = "Player 2 wins"
    player1 match {
      case "rock" =>
        player2 match {
          case "paper" => p2Wins
          case "scissor" => p1Wins
        }
      case "paper" =>
        player2 match {
          case "rock" => p1Wins
          case "scissor" => p2Wins
        }
      case "scissor" =>
        player2 match {
          case "rock" => p2Wins
          case "paper" => p1Wins
        }
    }
  }
}
