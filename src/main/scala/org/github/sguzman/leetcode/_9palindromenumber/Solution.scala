package org.github.sguzman.leetcode._9palindromenumber

object Solution {
  def isPalindrome(x: Int): Boolean = {
    val str = x.toString
    if (str.length == 1) return true

    if (str.length % 2 == 0) {
      str.slice(0, str.length / 2).reverse == str.slice(str.length / 2, str.length)
    } else {
      str.slice(0, str.length / 2).reverse == str.slice(str.length / 2 + 1, str.length)
    }
  }
}