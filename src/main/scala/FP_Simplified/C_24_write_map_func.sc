def map[A](f: Int => A, list: List[Int]) : List[A] = for (x <- list) yield f(x)

val double : Int => Int = (n: Int) => n*2

val list = List(1,2,3,4,5)

map(double, list)

def genericMap[A,B](f: A => B, list: Seq[A]) : Seq[B] = for (x <- list) yield f(x)

genericMap(double, list)
