package org.github.sguzman.leetcode.addtwonumbers2

import org.junit.Assert

object SolutionTest {

  private def addTwoNumbersGeneralAssertTest(listA: ListNode, listB: ListNode, expect: ListNode): Unit = {
    val actual = Solution.addTwoNumbers(listA, listB)

    Assert.assertEquals(s"Nodes A=[$actual] and B=[$expect] not equal", expect.toString, actual.toString)
  }

  private def buildListNode(nums: Int*): ListNode = {
    if (nums.isEmpty) {
      return ListNode(-1)
    }

    val head = ListNode(-1)
    var currNode = head
    var idx = 0
    while (idx < nums.length) {
      val value = nums(idx)
      currNode.x = value
      currNode.next = ListNode(-1)
      currNode = currNode.next

      idx += 1
    }

    head
  }
}

class SolutionTest {
  @org.junit.Test
  def addTwoNumbersTest1(): Unit = {
    val listA = SolutionTest.buildListNode(2, 4, 3)
    val listB = SolutionTest.buildListNode(5, 6, 4)

    val expect = SolutionTest.buildListNode(7, 0, 8)

    SolutionTest.addTwoNumbersGeneralAssertTest(listA, listB, expect)
  }

  @org.junit.Test
  def addTwoNumbersTest2(): Unit = {
    val listA = SolutionTest.buildListNode(1, 3, 3)
    val listB = SolutionTest.buildListNode(5, 6, 4)

    val expect = SolutionTest.buildListNode(6, 9, 7)

    SolutionTest.addTwoNumbersGeneralAssertTest(listA, listB, expect)
  }

  @org.junit.Test
  def addTwoNumbersTest3(): Unit = {
    val listA = SolutionTest.buildListNode(0, 1)
    val listB = SolutionTest.buildListNode(0, 1, 2)

    val expect = SolutionTest.buildListNode(0, 2, 2)

    SolutionTest.addTwoNumbersGeneralAssertTest(listA, listB, expect)
  }

  @org.junit.Test
  def addTwoNumbersTest4(): Unit = {
    val listA = SolutionTest.buildListNode(9, 9)
    val listB = SolutionTest.buildListNode(1)

    val expect = SolutionTest.buildListNode(0, 0, 1)

    SolutionTest.addTwoNumbersGeneralAssertTest(listA, listB, expect)
  }

  @org.junit.Test
  def addTwoNumbersTest5(): Unit = {
    val listA = null
    val listB = SolutionTest.buildListNode(0, 1)

    val expect = SolutionTest.buildListNode(0, 1)

    SolutionTest.addTwoNumbersGeneralAssertTest(listA, listB, expect)
  }
}