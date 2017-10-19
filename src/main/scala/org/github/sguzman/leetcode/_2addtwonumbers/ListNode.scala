package org.github.sguzman.leetcode._2addtwonumbers

sealed case class ListNode(var x: Int = 0, var next: ListNode = null) {
  override def toString: String = {
    val buff = new StringBuilder()
    buff.append('(').append(x)

    var currNode = this.next
    while (currNode != null && currNode.next != null) {
      buff.append(" -> ").append(currNode.x)
      currNode = currNode.next
    }

    buff.append(')')

    buff.toString
  }
}
