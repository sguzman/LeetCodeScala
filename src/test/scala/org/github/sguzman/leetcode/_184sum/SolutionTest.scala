package org.github.sguzman.leetcode._184sum

import org.junit.{Assert, Test}

object SolutionTest {
  def fourSumGeneralTest(s: Array[Int], t: Int, expect: List[List[Int]]): Unit = {
    val actual = Solution.fourSum(s, t)
    Assert.assertEquals("Lengths of arrays are not equal", expect.length, actual.length)
    expect
      .map(_.toArray)
      .zip(actual
        .map(_.toArray))
      .foreach((tup: (Array[Int], Array[Int])) => Assert.assertArrayEquals(tup._1, tup._2))
  }
}

class SolutionTest {
  @Test
  def fourSumTest1(): Unit = {
    val s = Array(1, 0, -1, 0, -2, 2)
    val t = 0

    val expect = List(
      List(-2,-1, 1, 2),
      List(-2, 0, 0, 2),
      List(-1, 0, 0, 1)
    )

    SolutionTest.fourSumGeneralTest(s, t, expect)
  }

  @Test
  def fourSumTest2(): Unit = {
    val s = Array[Int]()
    val t = 0

    val expect = List()

    SolutionTest.fourSumGeneralTest(s, t, expect)
  }


}
