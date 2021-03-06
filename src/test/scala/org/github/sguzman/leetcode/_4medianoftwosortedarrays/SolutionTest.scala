package org.github.sguzman.leetcode._4medianoftwosortedarrays

import org.junit.{Assert, Test}

object SolutionTest {
  val delta = 0.00010

  def medianOfTwoSortedArraysGeneralTest(inputA: Array[Int], inputB: Array[Int], expect: Double): Unit = {
    val actual = Solution.findMedianSortedArrays(inputA, inputB)
    Assert.assertEquals(expect, actual, delta)
  }
}

class SolutionTest {
  @Test
  def medianOfTwoSortedArrays1(): Unit = {
    val inputA = Array(1, 3)
    val inputB = Array(2)
    val expect: Double = 2

    SolutionTest.medianOfTwoSortedArraysGeneralTest(inputA, inputB, expect)
  }

  @Test
  def medianOfTwoSortedArrays2(): Unit = {
    val inputA = Array(1, 2)
    val inputB = Array(3, 4)
    val expect: Double = 2.5

    SolutionTest.medianOfTwoSortedArraysGeneralTest(inputA, inputB, expect)
  }

  @Test
  def medianOfTwoSortedArrays3(): Unit = {
    val inputA = Array(3)
    val inputB = Array(1, 2, 4)
    val expect: Double = 2.5

    SolutionTest.medianOfTwoSortedArraysGeneralTest(inputA, inputB, expect)
  }

  @Test
  def medianOfTwoSortedArrays4(): Unit = {
    val inputA = Array(1, 2)
    val inputB = Array(1, 2, 3)
    val expect: Double = 2.0

    SolutionTest.medianOfTwoSortedArraysGeneralTest(inputA, inputB, expect)
  }


}