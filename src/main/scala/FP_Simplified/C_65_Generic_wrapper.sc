class Wrapper[A](value: A) {
  def map[B](f: A => B): Wrapper[B] = new Wrapper(f(value))
  def flatMap[B](f: A => Wrapper[B]): Wrapper[B] = f(value)
}

val result: Wrapper[Int] = for {
  a <- new Wrapper(12)
  b <- new Wrapper(-7)
  c <- new Wrapper(12)
} yield a + b + c

val result2: Wrapper[String] = for {
  a <- new Wrapper("sarb")
  b <- new Wrapper("darb")
  c <- new Wrapper("farb")
} yield a + b + c

result
result2