class Methods {
  def sum(a: Int, b: Int) = a + b
  val sum2 = (a: Int, b: Int) => a + b
}

def sum(a: Int, b: Int) = a + b
val sum2  = (a: Int, b: Int) => a + b

// Eta-expansion converts an expression of method type to an equivalent expression of function type

sum _ //this is how to manually convert method to function

// here it doesn't happen automatically so you have to do it
val functions = Map(
  "sum"  -> sum _
)