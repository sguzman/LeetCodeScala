package org.github.sguzman.leetcode._153sum

import org.junit.{Test, Assert}

object SolutionTest {
  private def twoSumGeneralAssertTest(nums: Array[Int], target: Int, expected: Array[Int]): Unit = {
    val actual = Solution.twoSum(nums, target)
    Assert.assertArrayEquals(expected, actual)
  }
}

class SolutionTest {
  @Test
  def twoSumTest1(): Unit = {
    val nums = Array(2, 7, 11, 15)
    val target = 9
    val expect = Array(0, 1)

    SolutionTest.twoSumGeneralAssertTest(nums, target, expect)
  }

  @Test
  def twoSumTest2(): Unit = {
    val nums = Array(3, 2, 4)
    val target = 6
    val expect = Array(1, 2)

    SolutionTest.twoSumGeneralAssertTest(nums, target, expect)
  }
}
