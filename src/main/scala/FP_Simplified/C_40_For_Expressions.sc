case class Person(fName: String, lName: String)

val people = List(
  Person("elvis", "dedic"),
  Person("umar", "dedic")
)

val nameStartingWithU = for {
  p <- people
  fName = p.fName
  if fName startsWith "u"
} yield fName.toUpperCase

