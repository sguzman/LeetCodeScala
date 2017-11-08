package org.github.sguzman.leetcode._163sumclosest

object Solution {
  def threeSumClosest(nums: Array[Int], target: Int): Int = {
    if (nums.length < 4){
      nums.sum
    } else if (nums.forall(_ == nums.head)) {
      nums.head * 3
    } else {
      -1
    }
  }
}