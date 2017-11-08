package org.github.sguzman.leetcode._1twosum

import org.junit.Assert

object SolutionTest2 {
  private def twoSumGeneralAssertTest(nums: Array[Int], target: Int, expected: Array[Int]): Unit = {
    val actual = Solution2.twoSum(nums, target)
    Assert.assertArrayEquals(actual, expected)
  }
}

class SolutionTest2 {
  @org.junit.Test
  def twoSumTest1(): Unit = {
    val nums = Array(2, 7, 11, 15)
    val target = 9
    val expect = Array(0, 1)

    SolutionTest2.twoSumGeneralAssertTest(nums, target, expect)
  }

  @org.junit.Test
  def twoSumTest2(): Unit = {
    val nums = Array(3, 2, 4)
    val target = 6
    val expect = Array(1, 2)

    SolutionTest2.twoSumGeneralAssertTest(nums, target, expect)
  }

  @org.junit.Test
  def twoSumTest3(): Unit = {
    val nums = Array(3, 2, 4)
    val target = 8
    val expect = Array[Int]()

    SolutionTest2.twoSumGeneralAssertTest(nums, target, expect)
  }
}