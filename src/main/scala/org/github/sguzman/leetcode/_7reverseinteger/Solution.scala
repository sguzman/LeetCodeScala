package org.github.sguzman.leetcode._7reverseinteger

object Solution {
  def reverse(x: Int): Int = {
    if (x == 0) return 0
    if (x == -2147483648) return 0

    val sign = if (x.toString.head == '-') -1 else 1
    val long = math.abs(x).toString.reverse.toLong

    if (Int.MaxValue >= long && Int.MinValue <= long) {
      sign * long.toInt
    } else {
      0
    }
  }
}