package org.github.sguzman.leetcode._153sum

import org.junit.{Test, Assert}

class SolutionTest {
  @Test
  def twoSumTest1(): Unit = {
    val actual = Solution.threeSum(Array(-1, 0, 1, 2, -1, -4))
    val expect = List(List(1, -1, 0), List(2, -1, -1))

    Assert.assertEquals(expect, actual)
  }

  @Test
  def twoSumTest2(): Unit = {
    val actual = Solution.threeSum(Array())
    val expect = List()

    Assert.assertEquals(expect, actual)
  }

  @Test
  def twoSumTest3(): Unit = {
    val actual = Solution.threeSum(Array(-2, 0, 0, 2, 2))
    val expect = List(List(2, -2, 0))

    Assert.assertEquals(expect, actual)
  }


}
