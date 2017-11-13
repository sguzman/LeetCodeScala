package org.github.sguzman.leetcode._17lettercombinationsofaphonenumber

import org.junit.{Assert, Test}

class SolutionTest {
  @Test
  def letterCombinationsOfAPhoneNumberTest1(): Unit = {
    val input = "23"
    val expect = List("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf").mkString("[", ", ", "]")

    val actual = Solution.letterCombinations(input)
    Assert.assertEquals(expect, actual.mkString("[", ", ", "]"))
  }
}
