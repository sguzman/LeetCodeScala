package org.github.sguzman.leetcode._7reverseinteger

import org.junit.{Assert, Test}

object SolutionTest {
  def reverseIntegerGeneralTest(input1: Int, expect: Int): Unit = {
    val actual = Solution.reverse(input1)
    Assert.assertEquals(expect, actual)
  }
}

class SolutionTest {
  @Test
  def reverseInteger1(): Unit = {
    SolutionTest.reverseIntegerGeneralTest(123, 321)
  }

  @Test
  def reverseInteger2(): Unit = {
    SolutionTest.reverseIntegerGeneralTest(-123, -321)
  }

  @Test
  def reverseInteger3(): Unit = {
    SolutionTest.reverseIntegerGeneralTest(0, 0)
  }

  @Test
  def reverseInteger4(): Unit = {
    SolutionTest.reverseIntegerGeneralTest(-2147483648, 0)
  }


}