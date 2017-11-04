package org.github.sguzman.leetcode._12integertoroman

import org.junit.{Assert, Test}

class SolutionTest {
  @Test
  def integerToRoman1(): Unit = {
    val actual = Solution.intToRoman(1)
    Assert.assertEquals("I", actual)
  }

  @Test
  def integerToRoman2(): Unit = {
    val actual = Solution.intToRoman(9)
    Assert.assertEquals("IX", actual)
  }

  @Test
  def integerToRoman3(): Unit = {
    val actual = Solution.intToRoman(40)
    Assert.assertEquals("XL", actual)
  }

  @Test
  def integerToRoman4(): Unit = {
    val actual = Solution.intToRoman(1904)
    Assert.assertEquals("MCMIV", actual)
  }

  @Test
  def integerToRoman5(): Unit = {
    val actual = Solution.intToRoman(3549)
    Assert.assertEquals("MMMDXLIX", actual)
  }


}
