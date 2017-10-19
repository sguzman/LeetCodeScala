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
}