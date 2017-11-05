package org.github.sguzman.leetcode._14longestcommonprefix

import org.junit.{Assert, Test}

class SolutionTest {
  @Test
  def longestPrefix1(): Unit = {
    val actual = Solution.longestCommonPrefix(Array("a"))
    Assert.assertEquals("a", actual)
  }

  @Test
  def longestPrefix2(): Unit = {
    val actual = Solution.longestCommonPrefix(Array[String]())
    Assert.assertEquals("", actual)
  }

  @Test
  def longestPrefix3(): Unit = {
    val actual = Solution.longestCommonPrefix(Array("ab", "abc", "abd"))
    Assert.assertEquals("ab", actual)
  }

  @Test
  def longestPrefix4(): Unit = {
    val actual = Solution.longestCommonPrefix(Array("a", "b"))
    Assert.assertEquals("", actual)
  }

  @Test
  def longestPrefix5(): Unit = {
    val actual = Solution.longestCommonPrefix(Array("aa","ab"))
    Assert.assertEquals("a", actual)
  }


}
