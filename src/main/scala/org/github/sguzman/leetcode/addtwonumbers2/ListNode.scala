package org.github.sguzman.leetcode.addtwonumbers2

sealed case class ListNode(var x: Int = 0, var next: ListNode = null) {
  override def toString: String = {
    val buff = new StringBuilder()
    buff.append('(', x)

    var currNode = this.next
    while (currNode != null) {
      buff.append(" -> ", currNode.x)
      currNode = currNode.next
    }

    buff.append(')')

    buff.toString
  }
}
