package org.github.sguzman.leetcode._19removenthnodefromendoflist

import org.github.sguzman.leetcode._2addtwonumbers.SolutionTest
import org.junit.{Assert, Test}

object SolutionTest {

  private def removeNthNodeGeneralTest(listA: ListNode, n: Int, expect: ListNode): Unit = {
    val actual = Solution.removeNthFromEnd(listA, n)

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
  @Test
  def removeNthNodeFromEndOfList1(): Unit = {
    val listA = SolutionTest.buildListNode(Array(1, 2, 3, 4, 5))
    val n = 2

    val expect = SolutionTest.buildListNode(Array(1, 2, 3, 5))

    SolutionTest.removeNthNodeGeneralTest(listA, n, expect)
  }
}
