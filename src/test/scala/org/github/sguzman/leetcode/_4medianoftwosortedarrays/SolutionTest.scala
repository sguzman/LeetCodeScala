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
  def medianOfTwoSortedArrays: Unit = {

  }
}