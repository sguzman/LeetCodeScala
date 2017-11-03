package org.github.sguzman.leetcode._8stringtointegeratoi

object Solution {
  def myAtoi(str: String): Int = {
    if (str == null || str.length == 0) return 0

    val num = str.trim
    if (num.length == 0) return 0

    val sign = if (num.head == '-') -1 else 1

    val strippedOfSign = if (num.head == '-' || num.head == '+') num.tail else num
    if (strippedOfSign.length == 0) return 0

    val drop0s = strippedOfSign.dropWhile(_ == '0')
    if (drop0s.length == 0) return 0

    val digits: String = drop0s.takeWhile(ch => ch.isDigit)
    if (digits.length == 0) return 0

    val bigInt: BigInt = sign * BigInt(digits)
    if (bigInt > Int.MaxValue) return Int.MaxValue
    if (bigInt < Int.MinValue) return Int.MinValue

    bigInt.toInt
  }
}