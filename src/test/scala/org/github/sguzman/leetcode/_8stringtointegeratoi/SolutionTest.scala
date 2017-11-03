package org.github.sguzman.leetcode._8stringtointegeratoi

import org.junit.{Assert, Test}

object SolutionTest {
  def stringToIntegerAtoiGeneralTest(input1: String, expect: Int): Unit = {
    val actual = Solution.myAtoi(input1)
    Assert.assertEquals(expect, actual)
  }
}

class SolutionTest {
  @Test
  def stringToIntegerAtoiConversion1(): Unit = {
    SolutionTest.stringToIntegerAtoiGeneralTest("123", 123)
  }

  @Test
  def stringToIntegerAtoiConversion2(): Unit = {
    SolutionTest.stringToIntegerAtoiGeneralTest("", 0)
  }

  @Test
  def stringToIntegerAtoiConversion3(): Unit = {
    SolutionTest.stringToIntegerAtoiGeneralTest("+1", 1)
  }

  @Test
  def stringToIntegerAtoiConversion4(): Unit = {
    SolutionTest.stringToIntegerAtoiGeneralTest("     +004500", 4500)
  }

  @Test
  def stringToIntegerAtoiConversion5(): Unit = {
    SolutionTest.stringToIntegerAtoiGeneralTest("2147483648", 2147483647)
  }


}