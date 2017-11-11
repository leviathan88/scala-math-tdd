package LinearAlgebra

/**
  * Created by elvis on 11/11/2017.
  */
class MyVector(val x: Double, val y: Double, val z: Double=0) {

  // Private methods
  private def f(point: Double): Float = point.toFloat

  // Overriden methods
  override def toString =
    if (this.z!=0) s"[X: ${f(this.x)}, Y: ${f(this.y)}, Z: ${f(this.z)}]" else s"[X: ${f(this.x)}, Y: ${f(this.y)}]"

  override def hashCode = (x, y, z).##

  override def equals(that: Any) = that match {
    case that: MyVector => this.x == that.x && this.y == that.y && this.z == that.z
    case _ => false
  }

  // public instance methods
  def add(v1: MyVector) = new MyVector(this.x + v1.x, this.y + v1.y, this.z + v1.z)
  def subtract(v1: MyVector) = new MyVector(this.x - v1.x, this.y - v1.y, this.z - v1.z)
  def multiply(v1: MyVector) = new MyVector(this.x * v1.x, this.y * v1.y, this.z * v1.z)
  def scalarMultiply(scalar: Double) = new MyVector(scalar*this.x, scalar*this.y, scalar*this.z)
}

object MyVector {

  // public static methods
  def add(v1: MyVector, v2: MyVector) = new MyVector(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z)
  def subtract(v1: MyVector, v2: MyVector) = new MyVector(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z)
  def multiply(v1: MyVector, v2: MyVector) = new MyVector(v1.x * v2.x, v1.y * v2.y, v1.z * v2.z)
  def scalarMultiply(scalar: Double, v: MyVector) = new MyVector(scalar*v.x, scalar*v.y, scalar*v.z)
}
