package LinearAlgebraTest

/**
  * Created by elvis on 11/11/2017.
  */
import org.scalatest.FunSuite
import LinearAlgebra.MyVector

class MyVectorTest extends FunSuite {

  val v1 = new MyVector(3,4)
  val v2 = new MyVector(4,2)

  test("MyVector class correctly adds points") {
    val correctResult = new MyVector(7,6)
    assert(v1.add(v2)== correctResult)
    assert(MyVector.add(v1, v2) == correctResult)
  }

  test("MyVector class correctly subtracts points") {
    val correctResult = new MyVector(-1,2)
    assert(v1.subtract(v2)== correctResult)
    assert(MyVector.subtract(v1, v2) == correctResult)
  }

  test("MyVector class correctly multiplies points") {
    val correctResult = new MyVector(12,8)
    assert(v1.multiply(v2)== correctResult)
    assert(MyVector.multiply(v1, v2) == correctResult)
  }

  test("MyVector class correctly performs scalar multiply") {
    val correctResult = new MyVector(9, 12)
    assert(v1.scalarMultiply(3)== correctResult)
    assert(MyVector.scalarMultiply(3, v1) == correctResult)
  }


}
