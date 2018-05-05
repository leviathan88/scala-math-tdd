val list = List("foo", "bar")
val tmp = list.map(s => s.split(""))
val flattened = list.map(s => s.split("")).flatten
val flatsMapys = list.flatMap(s => s.split(""))

def makeInt(s: String) : Option[Int] = {
  try {
    Some(s.trim.toInt)
  } catch {
    case e: Exception => None
  }
}

val x = makeInt("1")
val y = makeInt("2")

y  map { b => b + 2}
x flatMap(a => y map { b => a + b})

val sum = for {
  x <- makeInt("1")
  y <- makeInt("2")
} yield x + y