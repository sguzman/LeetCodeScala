package org.github.sguzman.leetcode._153sum

import scala.collection.mutable

object Solution {
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    Nil
  }

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val mutHash = mutable.HashMap[Int,Int]()

    var idx = 0
    while (idx < nums.length) {
      val num = nums(idx)
      if (mutHash.contains(num))
        return Array(mutHash(num), idx)
      else
        mutHash.put(target - num, idx)

      idx += 1
    }

    // Shouldn't get here
    Array()
  }
}