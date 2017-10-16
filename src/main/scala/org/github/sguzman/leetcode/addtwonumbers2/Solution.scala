package org.github.sguzman.leetcode.addtwonumbers2

/**
  * Definition for singly-linked list.
  * class ListNode(var _x: Int = 0) {
  *   var next: ListNode = null
  *   var x: Int = _x
  * }
  */
object Solution {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    if (l1 == null) return l2
    if (l2 == null) return l1

    val sum = ListNode()
    var currNode = sum

    var p = l1
    var q = l2

    var carry = 0

    while (p != null || q != null) {
      val x = if (p == null) 0 else p.x
      val y = if (q == null) 0 else q.x

      val currSum = x + y + carry
      carry = if (currSum > 9) 1 else 0
      currNode.next = ListNode(if (currSum > 9) currSum - 10 else currSum)

      p = if (p != null) p.next else p
      q = if (q != null) q.next else q
      currNode = currNode.next
    }

    if (carry == 1) {
      currNode.next = ListNode(1)
    }

    sum.next
  }
}
