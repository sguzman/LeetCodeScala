package org.github.sguzman.leetcode._5longestpalindromicsubstring

import org.junit.{Assert, Test}

class SolutionTest {
  def longestPalindromeGeneralTest(input: String, expect: String): Unit = {
    val actual = Solution.longestPalindrome(input)
    Assert.assertEquals(expect, actual)
  }

  @Test
  def longestPalindrome1(): Unit = {
    longestPalindromeGeneralTest("babad", "bab")
  }

  @Test
  def longestPalindrome2(): Unit = {
    longestPalindromeGeneralTest("cbbd", "bb")
  }

  @Test
  def longestPalindrome3(): Unit = {
    longestPalindromeGeneralTest("a", "a")
  }


}