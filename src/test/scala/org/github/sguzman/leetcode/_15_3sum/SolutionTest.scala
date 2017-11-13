package org.github.sguzman.leetcode._15_3sum

import org.junit.{Test, Assert}

class SolutionTest {
  @Test
  def twoSumTest1(): Unit = {
    val actual = Solution.threeSum(Array(-1, 0, 1, 2, -1, -4))
    val expect = List(List(-1, -1, 2), List(-1, 0, 1))

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
    val expect = List(List(-2, 0, 2))

    Assert.assertEquals(expect, actual)
  }

  @Test
  def twoSumTest4(): Unit = {
    val actual = Solution.threeSum(Array(-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6))
    val expect = List(List(-4,-2,6),List(-4,0,4),List(-4,1,3),List(-4,2,2),List(-2,-2,4),List(-2,0,2))

    Assert.assertEquals(expect, actual)
  }


}
