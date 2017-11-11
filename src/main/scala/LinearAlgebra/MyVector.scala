package LinearAlgebra

/**
  * Created by elvis on 11/11/2017.
  */
class MyVector(val x: Double, val y: Double, val z: Double=0) {

  override def toString = if (this.z>0) s"[X: ${this.x}, Y: ${this.y}, Z:${this.z}]" else s"[X: ${this.x}, Y: ${this.y}]"

  def add(v1: MyVector) = new MyVector(this.x+v1.x, this.y+v1.y, this.z + v1.z)
}

object MyVector {
  def add(v1: MyVector, v2: MyVector) = new MyVector(v1.x+v2.x, v1.y+v2.y, v1.z + v2.z)
}
