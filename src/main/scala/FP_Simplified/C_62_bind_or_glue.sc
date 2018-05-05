def f(a: Int): (Int, String) = (2*a, "ssarna")
def g(a: Int): (Int, String) = (3*a, "paprika")
def h(a: Int): (Int, String) = (4*a, "svastika")

val fResult = f(100)
val gResult = bind(h, bind(g, fResult))

def bind(fun: (Int) => (Int, String), tup: (Int, String)) : (Int, String) = {
  val (intResult, stringResult) = fun(tup._1)
  (intResult, tup._2 + stringResult)
}