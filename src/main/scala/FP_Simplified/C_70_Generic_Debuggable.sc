case class Debuggable[A](value: A, message: String) {
  def map[B](f: A => B): Debuggable[B] = {
    val newValue = f(value)
    Debuggable(newValue, message)
  }

  def flatMap[B](f: A => Debuggable[B]) : Debuggable[B] = {
    val newValue: Debuggable[B] = f(value)
    Debuggable(newValue.value, message + "\n" + newValue.message)
  }
}