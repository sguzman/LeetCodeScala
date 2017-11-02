package org.github.sguzman.leetcode._5longestpalindromicsubstring

object Solution {
  def longestPalindrome(s: String): String = {
    if (s.length <= 1) return s

    val pre = _preProc(s)
    val P = new Array[Int](pre.length)

    var center = 0
    var right = 0
    var maxIdx = 0
    var idx = 2
    while (idx < pre.length - 1) { // Dynamic programming
      if (right > idx)
        P(idx) = Math.min(right - idx, P(2 * center - idx))
      while (pre.charAt(idx - (P(idx) + 1)) == pre.charAt(idx + (P(idx) + 1)))
        P(idx) += 1

      if (idx + P(idx) > right) {
        center = idx
        right = idx + P(idx)
      }
      if (P(idx) > P(maxIdx)) maxIdx = idx

      idx += 1
    }

    val start = (maxIdx - 1 - P(maxIdx)) / 2
    s.substring(start, start + P(maxIdx))
  }

  private def _preProc(s: String) = {
    "^#" ++ s.flatMap(_.toString + "#") ++ "$"
  }
}