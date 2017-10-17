package org.github.sguzman.leetcode.longestsubstringwithoutrepeatingcharacters3

import scala.collection.mutable

object Solution {
  def lengthOfLongestSubstring(s: String): Int = {
    var maxLength = 0
    var currIdx = 0
    var startIdx = 0

    val map = mutable.HashMap[Char, Int]()

    while (currIdx < s.length) {
      val ch = s(currIdx)
      startIdx = Math.max(map.getOrElse(ch, -1), startIdx)

      maxLength = Math.max(maxLength, currIdx - startIdx + 1)
      map.put(ch, currIdx + 1)

      currIdx += 1
    }
    maxLength
  }
}