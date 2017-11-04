package org.github.sguzman.leetcode._12integertoroman

object Solution {
  def intToRoman(num: Int): String = {
    val m = Array("", "M", "MM", "MMM")
    val c = Array("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")
    val x = Array("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
    val i = Array("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")

    val thousands = m(num / 1000)
    val hundreds = c((num % 1000) / 100)
    val tens = x((num % 100) / 10)
    val ones = i(num % 10)

    thousands ++ hundreds ++ tens ++ ones
  }
}