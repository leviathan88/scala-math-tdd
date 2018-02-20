// Partially Applied Functions

def plus(a: Int)(b: Int) = a + b
val plus2: (Int => Int) = plus(2)(_)

plus2(9)

val hello = "Hello cruel world"

def wrap(prefix: String)(html: String)(suffix: String) = prefix + html + suffix

val wrapWithDiv: (String => String) = wrap("<div>")(_: String)("</div>")

wrapWithDiv(hello)

// currying
def add(a: Int, b: Int) = a + b
add _ // add curried to this and its done

val addInGroupParams = (add _).curried
addInGroupParams(3)(7)

val p: (Int, Int) => Int = (a: Int, b: Int) => a + b
val g = p.curried
g(8)(2)

