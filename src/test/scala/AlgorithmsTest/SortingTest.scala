package AlgorithmsTest

import Algorithms.Sorting
import org.scalatest.FunSuite

class SortingTest extends FunSuite {

  val unsorted = Array(1, 3, 9, 19, 23, 45, 5, 2, 12, 7)
  val sorted = Array(1, 2, 3, 5, 7, 9, 12, 19, 23, 45)

  test("bubblesort should sort array correctly") {
    assert(Sorting.bubblesort(unsorted).deep == sorted.deep)
  }

  test("insertionsort should sort array correctly") {
    assert(Sorting.insertionsort(unsorted).deep == sorted.deep)
  }

  test("mergesort should sort array correctly") {
    assert(Sorting.mergesort(unsorted).deep == sorted.deep)
  }

  test("countsort should sort array correctly") {
    assert(Sorting.countSort(unsorted).deep == sorted.deep)
  }

}
