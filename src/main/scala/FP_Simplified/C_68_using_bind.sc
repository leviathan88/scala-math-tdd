case class Debuggable(value: Int, message: String) {
  def map(f: Int => Int): Debuggable = {
    val newValue = f(value)
    Debuggable(newValue, message)
  }

  def flatMap(f: Int => Debuggable) : Debuggable = {
    val newValue: Debuggable = f(value)
    Debuggable(newValue.value, message + "\n" + newValue.message)
  }
}
def f(a: Int): Debuggable = {
  val result = 2 * a
  val message = s"f: a ($a) is $result"
  Debuggable(result, message)
}

def g(a: Int): Debuggable = {
  val result = 3 * a
  val message = s"g: a ($a) is $result"
  Debuggable(result, message)
}

def h(a: Int): Debuggable = {
  val result = 4 * a
  val message = s"h: a ($a) is $result"
  Debuggable(result, message)
}

val finalResult = for {
  fResult <- f(100)
  gResult <- g(fResult)
  hResult <- h(gResult)
} yield hResult