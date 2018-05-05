class Wrapper[Int](value: Int) {
  def map(f: Int => Int): Wrapper[Int] = new Wrapper(f(value))
  def flatMap(f: Int => Wrapper[Int]): Wrapper[Int] = f(value)
}

val result: Wrapper[Int] = for {
  a <- new Wrapper(12)
  b <- new Wrapper(-7)
  c <- new Wrapper(12)
} yield a + b + c