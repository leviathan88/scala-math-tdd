val lines = List("one hot line", "second cold line", "third colder and hotter longer line")
def widthOfLength(s: String) = s.length.toString.length

// instead of this
var maxWidth = 0
for (line <- lines)
    maxWidth = maxWidth.max(widthOfLength(line))
maxWidth

// do this
val longestLine = lines.reduceLeft(
  (a, b) => if(a.length > b.length) a else b
)

val maxWidth2 = widthOfLength(longestLine)