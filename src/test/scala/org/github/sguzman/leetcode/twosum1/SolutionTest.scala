package org.github.sguzman.leetcode.twosum1

import org.junit.Assert

object SolutionTest {
  private def twoSumGeneralAssertTest(nums: Array[Int], target: Int, expected: Array[Int]): Unit = {
    val actual = Solution.twoSum(nums, target)
    Assert.assertArrayEquals(actual, expected)
  }


}

class SolutionTest {
  @org.junit.Test
  def twoSumTest1(): Unit = {
    val nums = Array(2, 7, 11, 15)
    val target = 9
    val expect = Array(0, 1)

    SolutionTest.twoSumGeneralAssertTest(nums, target, expect)
  }
}