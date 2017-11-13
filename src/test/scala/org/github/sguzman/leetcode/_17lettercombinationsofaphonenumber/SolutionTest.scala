package org.github.sguzman.leetcode._17lettercombinationsofaphonenumber

import org.junit.{Assert, Test}

object SolutionTest {
  def testGeneral(input: String, expect: List[String]): Unit = {
    val actual = Solution.letterCombinations(input)
    Assert.assertEquals(expect.mkString("[", ", ", "]"), actual.mkString("[", ", ", "]"))
  }
}

class SolutionTest {
  @Test
  def letterCombinationsOfAPhoneNumberTest1(): Unit = {
    val input = "23"
    val expect = List("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")

    SolutionTest.testGeneral(input, expect)
    )
  }
}
