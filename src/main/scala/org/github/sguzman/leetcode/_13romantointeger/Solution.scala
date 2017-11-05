package org.github.sguzman.leetcode._13romantointeger

object Solution {
  def romanToInt(s: String, num: Int = 0): Int = {
    if (s == null || s.isEmpty) return num
    if (s.length == 1) {
      return num + (if (s.head == 'I') 1
      else if (s.head == 'V') 5
      else if (s.head == 'X') 10
      else if (s.head == 'L') 50
      else if (s.head == 'C') 100
      else if (s.head == 'D') 500
      else 1000)
    }

    if (romanToInt(s.head.toString) < romanToInt(s.substring(1, 2)))
      romanToInt(s.tail, num - romanToInt(s.head.toString))
    else
      romanToInt(s.tail, num + romanToInt(s.head.toString))
  }
}