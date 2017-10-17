package org.github.sguzman.leetcode.longestsubstringwithoutrepeatingcharacters3

import org.junit.{Assert, Test}

object SolutionTest {
  def lengthOfLongestSubstringGeneralTest(input: String, expect: Int): Unit = {
    val actual = Solution.lengthOfLongestSubstring(input)
    Assert.assertEquals(expect, actual)
  }
}

class SolutionTest {
  @Test
  def lengthOfLongestSubstring1(): Unit = {
    SolutionTest.lengthOfLongestSubstringGeneralTest("abcabcbb", 3)
  }

  @Test
  def lengthOfLongestSubstring2(): Unit = {
    SolutionTest.lengthOfLongestSubstringGeneralTest("bbbbbb", 1)
  }

  @Test
  def lengthOfLongestSubstring3(): Unit = {
    SolutionTest.lengthOfLongestSubstringGeneralTest("pwwkew", 3)
  }

  @Test
  def lengthOfLongestSubstring4(): Unit = {
    SolutionTest.lengthOfLongestSubstringGeneralTest("dvdf", 3)
  }


}
