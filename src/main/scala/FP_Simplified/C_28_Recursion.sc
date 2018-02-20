def sum(list: List[Int]) : Int = {

  def loop(list: List[Int], acc: Int): Int = list match  {
    case Nil => acc
    case head::tail => loop(tail, acc+head)
  }

  loop(list, 0)
}

