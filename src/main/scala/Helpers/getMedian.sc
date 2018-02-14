def isEven(n: Int) = n%2==0
def calculateMedian(size: Int, mid: Int, lMid: Int) =
  if(isEven(size)) Math.round(((mid+lMid).toDouble)/2).toInt else mid
def getMedian(array: Array[Int]) : Int =
  calculateMedian(array.length,
    array(Math.floor(array.length/2).toInt), array(Math.floor(array.length/2).toInt-1))