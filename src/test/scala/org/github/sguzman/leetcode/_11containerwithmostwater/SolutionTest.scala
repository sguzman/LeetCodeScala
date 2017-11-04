package org.github.sguzman.leetcode._11containerwithmostwater

import org.junit.{Assert, Test}

class SolutionTest {
  @Test
  def mostWater1(): Unit = {
    val actual = Solution.maxArea(Array(1, 1))
    Assert.assertEquals(1, actual)
  }

@Test
  def mostWater2(): Unit = {
    val actual = Solution.maxArea(Array(1, 2))
    Assert.assertEquals(1, actual)
  }


}
