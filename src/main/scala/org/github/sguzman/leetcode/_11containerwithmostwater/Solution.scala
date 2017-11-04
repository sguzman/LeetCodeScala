package org.github.sguzman.leetcode._11containerwithmostwater

object Solution {
  def maxArea(height: Array[Int], maxA: Int = 0): Int = {
    if (height.length == 0) return maxA
    if (height.length == 1) return maxA

    val min = math.min(height.head, height.last)
    val newArea = math.max(maxA, min * (height.length - 1))
    val newHeight = if (min == height.head) height.tail else height.init

    maxArea(newHeight, newArea)
  }

}