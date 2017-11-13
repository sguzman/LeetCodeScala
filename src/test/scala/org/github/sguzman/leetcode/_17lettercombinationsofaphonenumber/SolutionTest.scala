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
  }

  @Test
  def letterCombinationsOfAPhoneNumberTest2(): Unit = {
    val input = ""
    val expect = List()

    SolutionTest.testGeneral(input, expect)
  }

  @Test
  def letterCombinationsOfAPhoneNumberTest3(): Unit = {
    val input = "45"
    val expect = List("gj", "gk", "gl", "hj", "hk", "hl", "ij", "ik", "il")

    SolutionTest.testGeneral(input, expect)
  }

  @Test
  def letterCombinationsOfAPhoneNumberTest4(): Unit = {
    val input = "67"
    val expect = List("mp", "mq", "mr", "ms", "np", "nq", "nr", "ns", "op", "oq", "or", "os")

    SolutionTest.testGeneral(input, expect)
  }

  @Test
  def letterCombinationsOfAPhoneNumberTest5(): Unit = {
    val input = "89"
    val expect = List("tw", "tx", "ty", "tz", "uw", "ux", "uy", "uz", "vw", "vx", "vy", "vz")

    SolutionTest.testGeneral(input, expect)
  }


}
