package org.github.sguzman.leetcode.addtwonumbers2

import org.junit.Assert

object SolutionTest {
  private def addTwoNumbersGeneralAssertTest(): Unit = {
  }

  private def buildListNode(nums: Int*): ListNode = {
    if (nums.isEmpty) {
      return ListNode(-1)
    }

    val head = ListNode(-1)
    var currNode = head
    nums.foreach(value => {
      currNode.x = value
      currNode.next = ListNode(-1)
      currNode = currNode.next
    })

    head
  }
}

class SolutionTest {
  @org.junit.Test
  def addTwoNumbersTest1(): Unit = {
    val listA = SolutionTest.buildListNode(2, 4, 3)

    SolutionTest.addTwoNumbersGeneralAssertTest()
  }

  @org.junit.Test
  def addTwoNumbersTest2(): Unit = {
    SolutionTest.addTwoNumbersGeneralAssertTest()
  }
}