case class Sequence[A](initialElems: A*) {
  private val elems = scala.collection.mutable.ArrayBuffer[A]()

  elems ++= initialElems

  def foreach(block: A => Unit): Unit = {
    elems.foreach(block)
  }
}

val strings = Sequence("a", "asdasd", "sad")
def genericMap[A,B](f: A => B, list: Seq[A]) : Seq[B] = for (x <- list) yield f(x)