package org.github.sguzman.leetcode.addtwonumbers2

import org.junit.Assert

object SolutionTest {

  private def addTwoNumbersGeneralAssertTest(listA: ListNode, listB: ListNode, expect: ListNode): Unit = {
    val actual = Solution.addTwoNumbers(listA, listB)

    Assert.assertEquals(s"Nodes A=[$listA] and B=[$listB] not equal", listA.toString, listB.toString)
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
  }
}