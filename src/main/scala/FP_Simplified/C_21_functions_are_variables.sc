// function literal
// functions also have variable names, types and values

// x => x * 2 is a function literal
// function literals can be assigned to variable names

val isEven = (i: Int) => i % 2 == 0

val double = (x: Int) => x * 2
val triple = (x: Int) => x * 3

val functions = Map(
  "2x" -> double,
  "3x" -> triple
)

// return type Map[String, Int => Int]
// Int => Int that's how u write the type for a function that transforms a single Int to a resulting Int