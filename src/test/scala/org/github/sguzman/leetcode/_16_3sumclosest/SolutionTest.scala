package org.github.sguzman.leetcode._16_3sumclosest

import org.junit.{Assert, Test}

class SolutionTest {
  @Test
  def threeSumClosest1(): Unit = {
    val s = Array(-1, 2, 1, -4)
    val target = 1
    val expected = 2

    val actual = Solution.threeSumClosest(s, target)
    Assert.assertEquals(expected, actual)
  }

  @Test
  def threeSumClosest2(): Unit = {
    val s = Array(0, 0, 0)
    val target = 1
    val expected = 0

    val actual = Solution.threeSumClosest(s, target)
    Assert.assertEquals(expected, actual)
  }

  @Test
  def threeSumClosest3(): Unit = {
    val s = Array(0, 1, 2)
    val target = 1
    val expected = 3

    val actual = Solution.threeSumClosest(s, target)
    Assert.assertEquals(expected, actual)
  }

  @Test
  def threeSumClosest4(): Unit = {
    val s = Array(1, 1, 1, 1)
    val target = 0
    val expected = 3

    val actual = Solution.threeSumClosest(s, target)
    Assert.assertEquals(expected, actual)
  }

  @Test
  def threeSumClosest5(): Unit = {
    val s = Array(1, 1, 1, 0)
    val target = -100
    val expected = 2

    val actual = Solution.threeSumClosest(s, target)
    Assert.assertEquals(expected, actual)
  }

  @Test
  def threeSumClosest6(): Unit = {
    val s = Array(1, 2, 3, 4)
    val target = 6
    val expected = 6

    val actual = Solution.threeSumClosest(s, target)
    Assert.assertEquals(expected, actual)
  }


}
