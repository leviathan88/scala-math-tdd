import CoinFlip.s

import scala.util.Random

object CoinFlipUtils {
  def showPrompt: Unit = print("\n(h)heads, (t)ails, or (q)uit: ")
  def getUserInput = scala.io.StdIn.readLine.trim.toUpperCase()

  def printableFlipResult(flip: String) = flip match {
    case "H" => "Heads"
    case "T" => "Tails"
  }
  def printGameState(printableResult: String, gameState: GameState): Unit = {
    print(s"Flip was $printableResult")
    printGameState(gameState)
  }

  def printGameState(gameState: GameState): Unit = {
    println(s"\n#Flips: ${gameState.numFlips}, #Correct: ${gameState.numCorrectGuesses}")
  }

  def printGameOver: Unit = println("\n=== GAME OVER ===")

  def tossCoin(r: Random): String = {
    val i = r.nextInt(2)
    i match {
      case 0 => "H"
      case 1 => "T"
    }
  }
}
