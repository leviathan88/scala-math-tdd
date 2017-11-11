/**
  * Created by elvis on 11/11/2017.
  */
import LinearAlgebra.{MyVector}

object Main extends App {
  val v1 = new MyVector(5, 3)
  val v2 = new MyVector(1, 4)
  println(v1.add(v2))

  println(MyVector.add(new MyVector(3.0, 6.7, 12), new MyVector(9, 0.4)))
}
