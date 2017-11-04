package org.github.sguzman.leetcode._11containerwithmostwater

object Solution {
  def maxArea(height: Array[Int]): Int = {
    if (height.length == 2) return math.min(height.head, height(1)) * math.min(height.head, height(1))

    var r = height.length - 1
    var l = 0
    var maxArea = 0
    while (l != r) {
      maxArea = math.max(maxArea, math.min(height(l), height(r)) * (r - l))

      if (height(l) > height(r)) {
        r -= 1
      } else {
        l += 1
      }
    }

    maxArea
  }
}