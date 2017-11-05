package org.github.sguzman.leetcode._14longestcommonprefix

object Solution {
  def longestCommonPrefix(strs: Array[String]): String = {
    if (strs == null || strs.length == 0) return ""
    if (strs.length == 1) return strs.head

    val high = strs.map(_.length).min
    if (high == 0) return ""

    longestCommonPrefix(strs.map(_.substring(0, high)), 1, high)
  }

  def longestCommonPrefix(strs: Array[String], low: Int, high: Int): String = {
    if (low > high)
      return strs(0).substring(0, (low + high) / 2)

    val mid = (low + high) / 2
    if (isPrefix(strs, mid))
      longestCommonPrefix(strs, mid + 1, high)
    else
      longestCommonPrefix(strs, low, mid - 1)
  }

  private def isPrefix(strs: Array[String], len: Int): Boolean = {
    val str1 = strs(0).substring(0, len)
    strs.forall(_.startsWith(str1))
  }
}