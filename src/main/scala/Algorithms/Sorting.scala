package Algorithms

class Sorting {

}

object Sorting {
  def bubblesort(original: Array[Int]): Array[Int] = {
    val arr = original.clone

    for (_ <- arr) {
      for (j <- 0 until arr.length-1) {
        if(arr(j)>arr(j+1)) {
          //swap them
          val temp = arr(j+1)
          arr(j+1)=arr(j)
          arr(j)=temp
        }
      }
    }

    arr
  }

  def insertionsort(original: Array[Int]): Array[Int] = {
    val arr = original.clone

    for (i <- 1 until arr.length) {
      val temp = arr(i)
      var j = i

      while(j>0 && arr(j-1)>temp) {
        arr(j)=arr(j-1)
        j-=1
      }
      arr(j)=temp
    }

    arr
  }

  def mergesort(original: Array[Int]) : Array[Int] = {
    this._mergesort(original.clone)
  }

  private def _mergesort(arr: Array[Int]): Array[Int] = {
    if(arr.length<2) arr
    else {
      val (left, right) = arr.splitAt(arr.length/2)
      this._merge(this._mergesort(left), this._mergesort(right))
    }
  }

  private def _merge(left: Array[Int], right: Array[Int]): Array[Int] = {
    if(left.length<1) left
    else if(right.length<1) right
    else {
      val size = left.length+right.length
      val result = Array[Int](size)
      var leftIndex = 0
      var rightIndex = 0
      for (i <- 0 until size) {
        if(left(leftIndex)<right(rightIndex)) {
          result(i)=left(leftIndex)
          leftIndex+=1
        } else {
          result(i)=right(rightIndex)
          rightIndex+=1
        }
      }
      result
    }
  }


}