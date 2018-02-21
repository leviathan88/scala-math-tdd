import scala.util.Random
import CoinFlipUtils._

object CoinFlip extends App {
  val s = GameState(0, 0)
  val r = new Random
  mainLoop(s,r)

  @scala.annotation.tailrec
  def mainLoop(gameState: GameState, random: Random): Unit = {
    showPrompt
    val userInput = getUserInput

    userInput match {
      case "H" | "T" => {
        val coinTossResult = tossCoin(random)
        val newNumFlips = gameState.numFlips + 1
        val isGuessCorrect = userInput == coinTossResult
        val newGameState = gameState.copy(newNumFlips, gameState.numCorrectGuesses + (if(isGuessCorrect) 1 else 0))
        printGameState(coinTossResult, newGameState)
        mainLoop(newGameState, random)
        }
      case _ => {
        printGameOver
        printGameState(gameState)
      }
    }
  }
}

case class GameState (
  numFlips: Int,
  numCorrectGuesses: Int
)



