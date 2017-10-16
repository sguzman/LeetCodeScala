package org.github.sguzman.leetcode.addtwonumbers2

import org.junit.Assert

object SolutionTest {

  private def addTwoNumbersGeneralAssertTest(listA: ListNode, listB: ListNode, expect: ListNode): Unit = {
    val actual = Solution.addTwoNumbers(listA, listB)

    Assert.assertEquals(s"Nodes Actual=[$actual] and Expected=[$expect] not equal", expect.toString, actual.toString)
  }

  private def buildListNode(nums: Array[Int]): ListNode = {
    SolutionTest._buildListNode(ListNode(), nums)
  }

  private def _buildListNode(list: ListNode, nums: Array[Int]): ListNode = {
    if (nums.isEmpty) {
      list
    } else {
      list.x = nums.head
      list.next = ListNode()
      SolutionTest._buildListNode(list.next, nums.tail)

      list
    }
  }
}

class SolutionTest {
  @org.junit.Test
  def addTwoNumbersTest1(): Unit = {
    val listA = SolutionTest.buildListNode(Array(2, 4, 3))
    val listB = SolutionTest.buildListNode(Array(5, 6, 4))

    val expect = SolutionTest.buildListNode(Array(7, 0, 8))

    SolutionTest.addTwoNumbersGeneralAssertTest(listA, listB, expect)
  }

  @org.junit.Test
  def addTwoNumbersTest2(): Unit = {
    val listA = SolutionTest.buildListNode(Array(1, 3, 3))
    val listB = SolutionTest.buildListNode(Array(5, 6, 4))

    val expect = SolutionTest.buildListNode(Array(6, 9, 7))

    SolutionTest.addTwoNumbersGeneralAssertTest(listA, listB, expect)
  }

  @org.junit.Test
  def addTwoNumbersTest3(): Unit = {
    val listA = SolutionTest.buildListNode(Array(0, 1))
    val listB = SolutionTest.buildListNode(Array(0, 1, 2))

    val expect = SolutionTest.buildListNode(Array(0, 2, 2))

    SolutionTest.addTwoNumbersGeneralAssertTest(listA, listB, expect)
  }

  @org.junit.Test
  def addTwoNumbersTest4(): Unit = {
    val listA = SolutionTest.buildListNode(Array(9, 9))
    val listB = SolutionTest.buildListNode(Array(1))

    val expect = SolutionTest.buildListNode(Array(0, 0, 1))

    SolutionTest.addTwoNumbersGeneralAssertTest(listA, listB, expect)
  }

  @org.junit.Test
  def addTwoNumbersTest5(): Unit = {
    val listA = null
    val listB = SolutionTest.buildListNode(Array(0, 1))

    val expect = SolutionTest.buildListNode(Array(0, 1))

    SolutionTest.addTwoNumbersGeneralAssertTest(listA, listB, expect)
  }

  @org.junit.Test
  def addTwoNumbersTest6(): Unit = {
    val listA = null
    val listB = SolutionTest.buildListNode(Array(0, 8))

    val expect = SolutionTest.buildListNode(Array(0))

    SolutionTest.addTwoNumbersGeneralAssertTest(listA, listB, expect)
  }
}