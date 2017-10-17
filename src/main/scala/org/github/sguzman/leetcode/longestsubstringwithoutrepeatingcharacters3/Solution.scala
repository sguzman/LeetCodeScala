package org.github.sguzman.leetcode.longestsubstringwithoutrepeatingcharacters3

import scala.collection.mutable

object Solution {
  def lengthOfLongestSubstring(s: String): Int = {
    var maxLength = 0
    var idx = 0
    var startIdx = 0

    val mapIdx = mutable.HashMap[Char, Int]()
    while (idx < s.length) {
      val ch = s(idx)
      // If haven't seen
      if (mapIdx.getOrElse(ch, -1) >= startIdx) {
      } else {
        maxLength += 1
      }

      mapIdx.put(ch, idx)
      idx += 1
    }
    maxLength
  }
}