package org.github.sguzman.leetcode._13romantointeger

import org.junit.{Assert, Test}

class SolutionTest {
  @Test
  def integerToRoman1(): Unit = {
    val actual = Solution.romanToInt("I")
    Assert.assertEquals(1, actual)
  }

  @Test
  def integerToRoman2(): Unit = {
    val actual = Solution.romanToInt("IX")
    Assert.assertEquals(9, actual)
  }

  @Test
  def integerToRoman3(): Unit = {
    val actual = Solution.romanToInt("XL")
    Assert.assertEquals(40, actual)
  }

  @Test
  def integerToRoman4(): Unit = {
    val actual = Solution.romanToInt("MCMIV")
    Assert.assertEquals(1904, actual)
  }

  @Test
  def integerToRoman5(): Unit = {
    val actual = Solution.romanToInt("MMMDXLIX")
    Assert.assertEquals(3549, actual)
  }


}

