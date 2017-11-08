package org.github.sguzman.leetcode._1twosum

import scala.collection.mutable

object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val map = mutable.HashMap[Int, Int]()

    var currIdx = 0
    while(currIdx < nums.length){
      val currNum = nums(currIdx)
      if (map.contains(currNum)) {
        return Array(map(currNum), currIdx)
      } else {
        map.put(target - currNum, currIdx)
      }

      currIdx += 1
    }

    // Shouldn't get here
    Array[Int]()
  }
}