
val x = FOO {

}
// A
// can be :
// 1. Anonymous class
// 2. A Function that takes a by-name parameter


// -----------------------------------------------------------------------
// explaining A-1
// create an instance of Person using Scala's "anonymous class"
val mary = new Person {
  val name = "mary"
  val age = 22
}

// this could a TRAIT, ABSTRACT or normal CLASS
trait Person {
  def name: String
  def age: Int
  override def toString: String = s"name: $name, age: $age"
}
// it's not a case class, cuz they don't allow the use of the new keyword
// and they also must have at least one constructor parameter
// -----------------------------------------------------------------------

// -----------------------------------------------------------------------
// explaining A-2
// a function that takes a by-name parameter
val (result, time) = timer {
 Thread.sleep(1000)
  42
}

def timer[A](blockOfCode: => A) = {
  val startTime = System.nanoTime
  val result = blockOfCode
  val stopTime = System.nanoTime
  val delta = stopTime - startTime
  (result,delta/1000000d)
}