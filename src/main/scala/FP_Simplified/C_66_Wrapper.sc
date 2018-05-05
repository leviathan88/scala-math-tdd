// 1. Make the Wrapper class constructor private
class Wrapper[A] private (value: A) {
  def map[B](f: A => B): Wrapper[B] = new Wrapper(f(value))
  def flatMap[B](f: A => Wrapper[B]): Wrapper[B] = f(value)
}

// 2. create an object named Wrapper in the same file as the Wrapper class
object Wrapper {

  // 3. create an APPLY method in the companion object with the appropriate signature
  def apply[A](value: A): Wrapper[A] = new Wrapper[A](value)
  // val = Wrapper(1)
  // translated to
  // val a = Wrapper.apply(1(
}

val result: Wrapper[Int] = for {
  a <- Wrapper(12)
  b <- Wrapper(-7)
  c <- Wrapper(12)
} yield a + b + c

val result2: Wrapper[String] = for {
  a <- Wrapper("sarb")
  b <- Wrapper("darb")
  c <- Wrapper("farb")
} yield a + b + c

result
result2

// so this is a MONAD
// a class that has map and flatMap methods and has an apply method
// that's used to lift ordinary values like an Int into the monad