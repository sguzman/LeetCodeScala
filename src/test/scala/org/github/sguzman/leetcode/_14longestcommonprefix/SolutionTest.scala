package org.github.sguzman.leetcode._14longestcommonprefix

import org.junit.{Assert, Test}

class SolutionTest {
  @Test
  def longestPrefix1(): Unit = {
    val actual = Solution.longestCommonPrefix(Array("a"))
    Assert.assertEquals(actual, "a")
  }
}
