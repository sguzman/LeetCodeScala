package org.github.sguzman.leetcode._9palindromenumber

import org.junit.{Assert, Test}

class SolutionTest {

  @Test
  def palindromeTest1(): Unit = {
    val actual = Solution.isPalindrome(-2147483648)
    Assert.assertEquals(false, actual)
  }

  @Test
  def palindromeTest2(): Unit = {
    val actual = Solution.isPalindrome(0)
    Assert.assertEquals(true, actual)
  }

  @Test
  def palindromeTest3(): Unit = {
    val actual = Solution.isPalindrome(121)
    Assert.assertEquals(true, actual)
  }

  @Test
  def palindromeTest4(): Unit = {
    val actual = Solution.isPalindrome(1231)
    Assert.assertEquals(false, actual)
  }
}