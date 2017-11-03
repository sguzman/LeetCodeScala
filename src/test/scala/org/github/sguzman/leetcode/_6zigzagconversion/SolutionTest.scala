package org.github.sguzman.leetcode._6zigzagconversion

import org.junit.{Assert, Test}

object SolutionTest {
  def zigzagConversionGeneralTest(input1: String, input2: Int, expect: String): Unit = {
    val actual = Solution.convert(input1, input2)
    Assert.assertEquals(expect, actual)
  }
}

class SolutionTest {
  @Test
  def zigzagConversion1(): Unit = {
    SolutionTest.zigzagConversionGeneralTest("PAYPALISHIRING", 3, "PAHNAPLSIIGYIR")
  }

  @Test
  def zigzagConversion2(): Unit = {
    SolutionTest.zigzagConversionGeneralTest("A", 1, "A")
  }


}