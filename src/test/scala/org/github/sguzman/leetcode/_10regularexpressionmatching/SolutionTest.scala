package org.github.sguzman.leetcode._10regularexpressionmatching

import org.junit.{Assert, Test}

class SolutionTest {
  @Test
  def regExprMatching1(): Unit = {
    val actual = Solution.isMatch("aa", "a")
    Assert.assertEquals(false, actual)
  }

  @Test
  def regExprMatching2(): Unit = {
    val actual = Solution.isMatch("aa", "aa")
    Assert.assertEquals(true, actual)
  }

  @Test
  def regExprMatching3(): Unit = {
    val actual = Solution.isMatch("aaa", "aa")
    Assert.assertEquals(false, actual)
  }

  @Test
  def regExprMatching4(): Unit = {
    val actual = Solution.isMatch("aa", "a*")
    Assert.assertEquals(true, actual)
  }

  @Test
  def regExprMatching5(): Unit = {
    val actual = Solution.isMatch("aa", ".*")
    Assert.assertEquals(true, actual)
  }

  @Test
  def regExprMatching6(): Unit = {
    val actual = Solution.isMatch("ab", ".*")
    Assert.assertEquals(true, actual)
  }

  @Test
  def regExprMatching7(): Unit = {
    val actual = Solution.isMatch("aab", "c*a*b*")
    Assert.assertEquals(true, actual)
  }
}
