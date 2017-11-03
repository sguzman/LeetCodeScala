package org.github.sguzman.leetcode._6zigzagconversion

object Solution {
  def convert(s: String, numRows: Int): String = {
    if (numRows == 1) return s

    val k = numRows * 2 - 2

    val outer = (0 until numRows).map(idx => for (i <- idx until s.length by k) yield i)
    val inner = (0 until numRows).map(idx => (for (i <- idx until s.length by k) yield i).map(_ + (k - 2 * idx)))

    outer.zip(inner).map(i => (i._1 ++ i._2).sorted.distinct.filter(_ < s.length).map(s).mkString).mkString
  }
}