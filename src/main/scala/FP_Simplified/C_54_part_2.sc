val f = FOO { (a: String) =>
}
// B
// it can be:
// 1. A class that takes a function parameter
// 2. A function that takes a by-name parameter

// explaining B-1
// a class that takes a function parameter
case class StringToInt(run: String => Int)

// this is how you create an instance of the above class, using anonymous function
val stringToInt = StringToInt { s: String =>
  s.length
}

stringToInt.run("joegoesbananas")

// explaining B-2
// a function that takes a by-name parameter

def s2i(s: String)(f: String => Int) = f(s)
val res = s2i("hello") { s: String =>
  s.length
}
res

// but could be a case class too, although convoluted
case class s2i2(s: String)(_fun: String => Int) {
  def fun = _fun(s)
}

val res2 = s2i2("yellow") { s: String =>
  s.length
}

res2