val words = new Array[String](3)

words(0) = "elvis"
words(1) = "umar"
words(2) = "levi"

val range = 0 to 2
val over = range.iterator
range.foreach(n=>println(words(n)))
over.foreach(n=>println(words(n)))

//When you apply parentheses surrounding one or more values to a variable,
// Scala will transform the code into an invocation of a method named apply on that variable.
// So words(i) gets transformed into words.apply(i).
// Thus accessing an element of an array in Scala is simply a method call like any other.
// This principle is not restricted to arrays:
// any application of an object to some arguments in parentheses will be transformed to
// an apply method call.
//
// Of course this will compile only if that type of object actually defines an apply method.
// So it's not a special case; it's a general rule.

//Similarly, when an assignment is made to a variable to which parentheses and one or
// more arguments have been applied, the compiler will transform that into an invocation of an
// update method that takes the arguments in parentheses as well as
// the object to the right of the equals sign.
// For example:

words.update(2, "simecki") // equals words(2)="simecki"

val moreWords = Array("semso", "dupan", "sahbaz")
val evenMoreWords = Array.apply("semso", "dupan", "sahbaz")
