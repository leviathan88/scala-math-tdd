/**
  * Created by elvis on 11/11/2017.
  */
import LinearAlgebra.{MyVector}

object Main extends App {

  println("Lesson 2 -> Quiz: Plus, Minus, Scalar Multiply")
  println(MyVector.add(new MyVector(8.218, -9.341), new MyVector(-1.129, 2.111)))
  println(MyVector.subtract(new MyVector(7.119, 8.215), new MyVector(-8.223, 0.878)))
  println(MyVector.scalarMultiply(7.41, new MyVector(1.671, -1.012, -0.318)))

}
